<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Here are users !!!</h2>
<form:errors path="password"/>
<form:form action="submitUser" method="post" modelAttribute="userModel">

Username : <form:input path="username" disabled="disabled"/><br/>

Password : <form:password path="password" /><br/>

<input type="submit" value="Update"/>
</form:form>

</body>
</html>