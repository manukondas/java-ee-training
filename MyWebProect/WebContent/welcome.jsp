<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to my website : <%= request.getParameter("username") %></h1>
<!-- This is html comment -->

<%-- This is JSP comment --%>
<%

int c,d=3;
out.println("Time at the server now is "+new Date());

%>
<br/>
<%-- This is JSP expression --%>

Time now at the Server : <%= new Date() %>

<%-- JSP expressions --%>

<%! int a,b=2; %>
<jsp:include page="footer.jsp"></jsp:include>
<br/>


</body>
</html>