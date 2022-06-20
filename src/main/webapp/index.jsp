<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="add" method="post">
    <label>Number 1</label> <br/>
    <input type="text" name="num1"> <br/>
    <label>Number2</label> <br/>
    <input type="text" name="num2">
    <input type="submit">
</form>
</body>
</html>