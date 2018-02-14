import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet { 
  protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
    // reading the user input
    String color= request.getParameter("color");    
    PrintWriter out = response.getWriter();
    out.println (
      "Hello World"
    );  
  }  
}