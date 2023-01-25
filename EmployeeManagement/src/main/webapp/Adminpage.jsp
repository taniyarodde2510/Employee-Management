<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<link href="bootstrap.min.css" rel="Stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Employee Management</a> 
  
  <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="add">Add</a>
      </li>
    </ul>
    
</nav>
<br>
<br>
<table class="table table-bordered table-hover">
    <tr>
    <th>Employee Id</th>
    <th>Employee Name</th>
    <th>Employee Mobile</th>
    <th>Employee Email</th>
    <th>Account no</th>
    <th>Balance</th>
    <th> </th>
    <th> </th>
    </tr>
 <spring:forEach items="${lst }" var="rs">
<tr>
<td>${rs.empid}
<td>${rs.empname}
<td>${rs.mobile}
<td>${rs.email}
<td>${rs.empacc}
<td>${rs.balance}
<td><button class="btn btn-danger"><a class="nav-link" href="delete">Delete</a></button></td>
<td><button class="btn btn-success"><a class="nav-link" href="update">Edit</a></button></td>
</tr>

</spring:forEach>
    
    
      </table>
  
</body>
</html>