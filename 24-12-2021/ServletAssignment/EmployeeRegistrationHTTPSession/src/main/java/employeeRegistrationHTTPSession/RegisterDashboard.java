package employeeRegistrationHTTPSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterDashboard
 */
@WebServlet("/RegisterDashboard")
public class RegisterDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterDashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter();
         out.println("<html><body>");
         
         HttpSession session=request.getSession(false);  
         String username= null;
         String age= null;
         String city= null;
         String gender= null;
         String email= null;

         
         if (session.getAttribute("username") != null)
        	username =(String)session.getAttribute("username");  
         	age =(String)session.getAttribute("age");  
         	city =(String)session.getAttribute("city");  
         	email =(String)session.getAttribute("email");  
         	gender =(String)session.getAttribute("gender");  
 
         	
         	
         if (username == null ) {
             out.println("No UserName was found in session.<br>");
         } else {
             out.println("Welcome : " + username + "<br>");
             out.println("Age : " + age + "<br>");
             out.println("City : " + city + "<br>");
             out.println("Email : " + email + "<br>");
             out.println("Gender : " + gender + "<br>");
             out.println("Creation Time : " + session.getCreationTime() + "<br>");
             out.println("ID : " + session.getId() + "<br>");
             
         }
         out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
