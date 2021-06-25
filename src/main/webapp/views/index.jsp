<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Spring MVC Boot</title>
</head>
<body>
	Welcome to spring MVC!!
	<form action="/add">
	Enter 1st Number: <input type="text" name="num1"><br>
	Enter 2nd Number: <input type="text" name="num2"><br>
	<input type="submit">
	</form>
	
	<form action="/addAlien" method=post>
	Enter the id: <input type="text" name="aid"><br>
	Enter the name: <input type="text" name="aName"><br>
	<input type="submit">
	</form>
</body>
</html>