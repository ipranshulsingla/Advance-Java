

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/submit")
public class DemoController extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String str=request.getParameter("desc");
		int number=str.length();
		request.setAttribute("number",number);
		RequestDispatcher rd=request.getRequestDispatcher("response.jsp");
		rd.forward(request,response);
	}

}
