
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Pankaj
 */
public class TestGenericServlet extends GenericServlet 
{
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Generic Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=lightblue >");
        for (int i=1; i<=10; i++) 
        {
            out.println("<H1>Welcome to my Generic Servlet "+i+"</H1>");            
        }
        out.println("</BODY>");
        out.println("</HTML>");        
    }    
}
