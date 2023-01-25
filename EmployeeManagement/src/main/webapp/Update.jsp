<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="bootstrap.min.css" rel="Stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="col-md-4">
<br>
<h2>Update</h2>
<hr>
<form name="frm" method="post" action="updaterecord">
EmpId:<input type="text" name="empid" class="form-control">
Employee Name:<input type="text" name="empname" class="form-control">
mobile:<input type="text" name="mobile" class="form-control">
Email:<input type="email" name="email" class="form-control">
Employee Account no:<input type="text" name="empacc" class="form-control">
Balance:<input type="text" name="balance" class="form-control"><br>
<input type="submit" value="save" class="btn btn-info">

</form>
</div>
</div>

</body>
</html>