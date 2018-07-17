<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@page import="java.sql.*" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>logout.jsp페이지입니다.</h2>
<%session.invalidate(); %>
<%--  <%session.removeAttribute("id"); %> --%>
<script>
alert("로그아웃되었습니다.");
location.href="loginForm.jsp";

</script>
</body>
</html>