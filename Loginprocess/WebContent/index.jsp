<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>index.jsp파일입니다</h2>
<%
String id= (String)session.getAttribute("id");
if(id==null){
%>
<a href="loginform.jsp">로그인</a>
<%}else{ %>
<a href="logout.jsp">로그아웃</a>
<%} %>
</form>
</body>
</html>