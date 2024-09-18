
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Pankaj
 */
public class TestServlet implements Servlet
{
    public void init(ServletConfig config) throws ServletException 
    {
        System.out.println("Init Method");
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>First Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=lightblue >");
        for (int i=1; i<=10; i++) 
        {
            out.println("<H1>Welcome to my First Servlet "+i+"</H1>");            
        }
        out.println("</BODY>");
        out.println("</HTML>");        
    }
    
    public void destroy() 
    {
        System.out.println("Destroy Method");
    }

    public String getServletInfo() 
    {
        return null;
    }
    public ServletConfig getServletConfig() 
    {
        return null;
    }    
}