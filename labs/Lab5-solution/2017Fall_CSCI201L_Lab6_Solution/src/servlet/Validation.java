package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    	String name = request.getParameter("name");
    	String email = request.getParameter("email");
    	String month = request.getParameter("favmonth");
    	String url = request.getParameter("favweb");
    	String search = request.getParameter("favsearch");
    	PrintWriter pw = response.getWriter();
    	if (name == "") {
    		pw.println("name cannot be empty <br>");
    	}
    	if (email == ""){
    		pw.println("email cannot be empty <br>");
    	}
    	if (month == "") {
    		pw.println("month cannot be empty <br>");
    	}
    	if (url == ""){
    		pw.println("url cannot be empty <br>");
    	}
    	if (search == ""){
    		pw.println("search section cannot be empty <br>" );
    	}
    	pw.flush();
		pw.close();
    }

}
