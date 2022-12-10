package saagnik;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuestionServlet extends HttpServlet {

protected void processRequest(HttpServletRequest request,
								HttpServletResponse response)
	throws ServletException, IOException
	{
	response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Security Questions</title>");
	out.println("</head>");
	out.println("<body>");


	ArrayList<Question> qn = new ArrayList<Question>();

	// Adding members to the list. Here we are
	// using the parameterized constructor of

	qn.add(new Question("Enter your first school?", 1,  "Test"));
	qn.add(new Question("Enter your mothers name?", 2, "Test"));
	qn.add(new Question("Enter your nick name?", 3, "Test"));

	request.setAttribute("data", qn);

	
	RequestDispatcher rd =
			request.getRequestDispatcher("securityqns.jsp");

	rd.forward(request, response);
			out.println("</body>");
			out.println("</html>");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException, IOException
	{
		processRequest(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException, IOException
	{
		processRequest(request, response);
	}
	@Override
	public String getServletInfo()
	{
		return "Short description";
	}
}

