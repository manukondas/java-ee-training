<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.java.servlet.User, java.util.List" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<table border=1>

<tr>
<th>Username</th>
<th>Password</th>
<th></th>
</tr>

<c:forEach items="${requestScope.users }" var="user"> 
<tr>
<td>${user.username}</td>
<td>${user.password}</td>
<td><a href="remove?username=${user.username}">Remove</a> | <a href="update?username=${user.username}">Update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>