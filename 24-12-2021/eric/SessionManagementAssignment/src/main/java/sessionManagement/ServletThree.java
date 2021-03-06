package sessionManagement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletThree
 */
@WebServlet("/ServletThree")
public class ServletThree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletThree() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("pass", password);
		session.setAttribute("age", age);
		session.setAttribute("email", email);
		session.setAttribute("country", country);
		
		response.sendRedirect("ServletFour");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
