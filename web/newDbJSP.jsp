<%-- 
    Document   : newDbJSP
    Created on : 17 Sep, 2024, 3:34:21 PM
    Author     : rajes
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello User...!</h1>
        <%
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase","root","root");
            System.out.println("Connected");
            
            st = con.createStatement();
            
            String query = "SELECT * FROM emp";
            
            rs = st.executeQuery(query);
            
            %>
            <table border="1" width="400">
                <tr>
                    <td><strong>Emp ID:</strong></td>
                    <td><strong>Emp Name</strong></td>
                    <td><strong>Emp Salary:</strong></td>
                    <td><strong>Emp City:</strong></td>
                </tr>
        
            <%
            
            while(rs.next())
            {
            %>
                <tr>
                    <td><strong><%=rs.getString(1)%></strong></td>
                    <td><strong><%=rs.getString(2)%></strong></td>
                    <td><strong><%=rs.getString(3)%></strong></td>
                    <td><strong><%=rs.getString(4)%></strong></td>
                </tr>
            <%
            }
            con.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }            
        %>
            </table>
    </body>
</html>
