<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="bootstrap.min.css" rel="Stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Employee Management</a> 
</nav>
<div class="container">
<br>


<img width="400" height="300" src="images/Interaction.gif">

<form method="post" action="login">
<div class="d-flex justify-content-end">
<div class="col-md-4">
<h2>Login</h2>
Employee Id: <input type="text" name="empid" class="form-control">
Employee Name:<input type="text" name="empname" class="form-control">
<br>
<input type="submit" value="Login" class="btn btn-info">
<br>
<a href="add">Not Register? register here</a>
</div>
</div>
</form>

</div>





</body>
</html>