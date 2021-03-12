<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Here are users !!!</h2>
<form action="/submitUser" method="post">
Username : <input type="username" value="${user.username }" disabled="disabled"/><br/>
Password : <input type="password" value="${user.password }"/>
<input type="submit" value="Update"/>
</form>

</body>
</html>