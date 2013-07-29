<%-- 
    Document   : implicitObjects
    Created on : Jul 28, 2013, 10:51:44 PM
    Author     : Aravind Sarma Yeluripati
--%>
<%@page import="java.util.Enumeration" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Implicit objects</title>
    </head>
    <body>
        <b>Http headers:</b><br />
        <%
            for (Enumeration<String> e = request.getHeaderNames(); e.hasMoreElements();) {
                String header = e.nextElement();
                out.println(header + ": " + request.getHeader(header) + "<br/>");
            }
        %>
        <hr />
        <%
            out.println("Buffer size: " + response.getBufferSize() +"<br/>");
            out.println("Session id: " + session.getId() + "<br/>");
            out.println("Servlet name: " + config.getServletName() +"<br/>");
            out.println("Server info: " + application.getServerInfo());
        %>
    </body>
</html>
