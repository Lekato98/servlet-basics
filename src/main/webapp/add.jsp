<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Lekato98
  Date: 6/20/2022
  Time: 11:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Operation</title>
</head>
<body style="background-color: #d3d3d3">
    <%
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;
        PrintWriter writer = response.getWriter();
        writer.println("Result = " + result);
    %>
</body>
</html>
