package webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/userui")
public class UseruiServlet extends HttpServlet {
	private AndOrService andOrService = new AndOrService();
	
	
    public UseruiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//getParam names from the userui form
		String f1content = request.getParameter("f2");
		String f2content = request.getParameter("f2");
		String f3content = request.getParameter("f3");
		
		String addWords = request.getParameter("add");
		String orWords = request.getParameter("or");
		
		if((addWords != null ) && (orWords != null)) {
			request.setAttribute("errorAddorOR", "Choose Add or Or button please");
			request.getRequestDispatcher("WEB-INF/views/userui.jsp").forward(request, response);

		}
			
		
		//make sure all fields are filled
		if ( !("".equals(f1content)) && !("".equals(f2content)) && !("".equals(f3content)) ) {
			
			request.getRequestDispatcher("WEB-INF/views/results.jsp").forward(request, response);
	
		}
		
		else {
			request.setAttribute("errorNotAllFilled", "Fill in all the labels please");
			request.getRequestDispatcher("WEB-INF/views/userui.jsp").forward(request, response);
		}
	}
	
	

}
