import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pankaj
 */
public class TestLoginWithHTML extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Home</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=lightblue >");
        out.println("<H1>Welcome to my HttpServlet</H1>");                       
        if(username!=null && password!=null && username.equalsIgnoreCase("Sid") && password.equals("12345"))
        {
            response.sendRedirect("home.html");
        }
        else
        {
            response.sendRedirect("login.html");
        }
        out.println("</BODY>");
        out.println("</HTML>");        
    }    
}
