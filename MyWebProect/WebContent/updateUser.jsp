<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.java.servlet.User" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="submitUpdate">

Username : <input type="text" value="${user.username }" disabled="disabled"/><br/>
Password : <input type="text" value="${user.password }" /><br/>
<input type="submit" value="Update password"/>
</form>

</body>
</html>