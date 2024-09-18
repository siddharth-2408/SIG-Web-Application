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
public class TestHttpServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>HttpServlet - GET</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan >");
        out.println("<H1>Welcome to my HttpServlet</H1>");            
        out.println("<FORM action=TestHttpServlet method=Post >");
        out.println("To open Post Method click Here <INPUT type=submit>");
        out.println("</FORM>");
        out.println("</BODY>");
        out.println("</HTML>");        
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>HttpServlet - POST</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=lightblue >");
        out.println("<H1>Welcome to my HttpServlet - POST Method</H1>");            
        out.println("</BODY>");
        out.println("</HTML>");        
    }
}
