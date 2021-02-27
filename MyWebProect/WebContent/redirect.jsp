<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//request.getRequestDispatcher("welcome.jsp").forward(request, response);

//response.sendRedirect("welcome.jsp?username="+request.getParameter("username"));
%>
<jsp:forward page="welcome.jsp"></jsp:forward>
</body>
</html>