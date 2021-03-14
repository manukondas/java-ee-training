<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error{
color:red
}
</style>
</head>
<body>
<h2><spring:message code="edituser.welcome"/></h2>
<form:form action="submitUser" method="post" modelAttribute="userModel">
<table>
<tr>
<td><spring:message code="edituser.username"/>:</td>
<td><form:input path="username" disabled="disabled"/></td>
</tr>
<tr>
<td><spring:message code="edituser.password"/>:</td>
<td><form:password path="password" /></td>
<td><form:errors path="password" cssClass="error" /></td>
</tr>
<tr>
<td><input type="submit" value="Update"/></td>
</tr>
</table>





</form:form>

</body>
</html>