<%-- 
    Document   : jsp1
    Created on : 16 Sep, 2024, 6:47:13 PM
    Author     : rajes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            for (int i = 0; i < 10; i++) 
            {
                %>
                <h1>Hello<%=i%></h1>
        <%
            }
        %>
    </body>
</html>
