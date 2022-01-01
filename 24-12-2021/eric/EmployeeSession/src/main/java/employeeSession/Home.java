package employeeSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		String city = request.getParameter("city");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("age", age);
		session.setAttribute("city", city);
		session.setAttribute("gender", gender);
		session.setAttribute("email", email);
		
		out.println("Welcome " + username + "<br/><br/>");
		out.println("Your details are below:<br/><br/>");
		
		out.println("Age : " + age + "<br/>");
		out.println("City : " + city + "<br/>");
		out.println("Gender : " + gender + "<br/>");
		out.println("Email : " + email + "<br/>");
		
		response.sendRedirect("Store");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
