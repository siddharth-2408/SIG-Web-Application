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
public class TestHttpServletLogin extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Login</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=lightblue >");
        out.println("<H1>Welcome to my HttpServlet</H1>");            

        out.println("<FORM action=TestHttpServletLogin method=Post >");
        out.println("Username: <INPUT type=TEXT name=username ><BR/>");
        out.println("Password: <INPUT type=password name=password ><BR/>");
        out.println("<INPUT type=submit value=Login >");
        out.println("</FORM>");

        out.println("</BODY>");
        out.println("</HTML>");        
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
        out.println("<BODY bgcolor=cyan >");
        out.println("<H1>Welcome to my HttpServlet - POST Method</H1>");                      
        if(username!=null && password!=null && username.equalsIgnoreCase("Sid") && password.equals("12345"))
        {
            out.println("<H2>Login Successful..</H2>");
        }
        else
        {
            out.println("<H2>Login Failed..</H2>");
        }
        out.println("</BODY>");
        out.println("</HTML>");        
    }
}
