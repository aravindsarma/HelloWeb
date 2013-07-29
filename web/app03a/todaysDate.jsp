<%-- 
    Document   : todaysDate
    Created on : Jul 28, 2013, 10:36:17 PM
    Author     : Aravind Sarma Yeluripati
--%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Today's date</title>
    </head>
    <body>
        <%
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
            String s = dateFormat.format(new Date());
            out.println("<h1>Today is "+s+"</h1>");
        %>        
    </body>
</html>
