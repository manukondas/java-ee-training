<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="HI"></c:out></br>
<c:if test="${3>4 }">
Hello I am inside If<br/>
</c:if>

<c:choose>

<c:when test="${2>2 }">
I am inside When
</c:when>
<c:when test="${2>3 }">
I am inside When
</c:when>
<c:otherwise>
I am other wise<br/>
</c:otherwise>
</c:choose>

<!--<c:import url="http://www.google.com"></c:import>-->

<c:set var="siva" scope="session" value="hello"></c:set>

<c:out value="${requestScope.siva }"></c:out>

<c:forEach begin="0" end="10" >
hi<br/>


<fmt:formatDate pattern = "dd MMM YYYY hh:mm:ss a" 
         value = "<%= new java.util.Date() %>" />

</c:forEach>
</body>
</html>