package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Jdbc1 {
    private static final String url = "jdbc:mysql://localhost:3306/db_world";
    private static final String user = "root";
    private static final String password = "root";
    
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    java.sql.PreparedStatement prSt;
    
    public static void main(String[] args) {
		Jdbc1 jdbc = new Jdbc1();
		Scanner scanner  = new Scanner (System.in);
		
		System.out.println("-------------- Prepared Statement Menu--------------");
		System.out.println("1. Insert ");
		System.out.println("2. Update ");
		System.out.println("3. Delete ");
		System.out.println("Enter the choice 1-3");
		
		int number = scanner.nextInt();
		
		switch(number) {
		case 1: jdbc.insertRecord();
				break;
		
		case 2: jdbc.updateRecord();
				break;
		case 3: jdbc.deleteRecord();
		}	
		
	}

	private void deleteRecord() {
		// TODO Auto-generated method stub
		String sqlUpdate = "DELETE from emp where empid=?";
		
		try {
            try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
            prSt = con.prepareStatement(sqlUpdate);
            
            // Take user input for insertion
            Scanner input = new Scanner(System.in);	
            
            System.out.print("Enter the empid:  ");
            int eid = input.nextInt();
            System.out.println();
            
            prSt.setInt(1, eid);
            prSt.executeUpdate();
            
            System.out.println("Record deleted successfully");
		}
		catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }				
    
		
	}

	private void updateRecord() {
		// TODO Auto-generated method stub

String sqlUpdate = "UPDATE emp SET salary = ? WHERE empid = ?";
		
		try {
            try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
            prSt = con.prepareStatement(sqlUpdate);
            
            // Take user input for insertion
            Scanner input = new Scanner(System.in);	
            
            System.out.print("Enter the empid:  ");
            int eid = input.nextInt();
            System.out.println();
            
            System.out.print("Enter the employee salary:  ");
            int esal = input.nextInt();
            System.out.println();
            
            prSt.setInt(1, esal);
            prSt.setInt(2, eid);
 
            int rowAffected = prSt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));
 
            // update another record -reuse the prepared statement
            System.out.print("Enter the another empid:  ");
            int eid1 = input.nextInt();
            System.out.println();
            
            System.out.print("Enter the another employee salary:  ");
            int esal1 = input.nextInt();
            System.out.println();
            
            prSt.setInt(1, esal1);
            prSt.setInt(2, eid1);
 
            rowAffected = prSt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));
 
		}
		catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }		
	}

	public void insertRecord()
    {  
		String query = "insert into emp(empid,empname,salary) values(?,?,?)";
		
	      try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, password);
	           
	            prSt = con.prepareStatement(query);
	            
	            // Take user input for insertion
	            Scanner input = new Scanner(System.in);	
	            
	            System.out.print("Enter the empid:  ");
	            int eid = input.nextInt();
	            System.out.println();
	            
	            System.out.print("Enter the employee salary:  ");
	            int esal = input.nextInt();
	            System.out.println();
	            
	            System.out.print("Enter the employee name:  ");
	            String ename = input.next();
	            System.out.println();
	            
	            prSt.setInt(1, eid);
	            prSt.setString(2, ename);
	            prSt.setInt(3, esal);
	            
	            int count = prSt.executeUpdate();
	            
	            //show the number of records
	            stmt = con.createStatement();
	            
	            String query1 = "select * from emp";
	            ResultSet rs =  stmt.executeQuery(query1);
	            System.out.println("Id    Name    Salary");
	            
	            while (rs.next()) {
	               int id = rs.getInt("empid");
	               String name = rs.getString("empname");
	               String sal = rs.getString("salary");
	               System.out.println(id + "    " + name+"    "+sal);
	            }    
	            
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally{
	            try{
	                if(prSt != null) prSt.close();
	                if(con != null) con.close();
	            } catch(Exception ex){}
	        }
	}
}
