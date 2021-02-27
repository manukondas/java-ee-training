<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.java.servlet.Product, java.util.List" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to My Catalog</h1>

<table border=1>

<tr>
<th>Name</th>
<th>Quantity</th>
<th>Price</th>
</tr>

<c:forEach items="${requestScope.abhinavProducts }" var="product"> 
<tr>
<td>${product.name}</td>
<td>${product.qty}</td>
<td>${product.price}</td>
</tr>
</c:forEach>



</table>
</body>
</html>