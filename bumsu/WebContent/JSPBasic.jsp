<!--지시어 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.io.*,java.util.*,
    java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>JSPBaisc.jsp파일입니다.</h2>
<%/*스크립플릿(Scriptlet)*/ %>
<h2>현재시간은 <%=new SimpleDateFormat().format(new Date()) %></h2>
<%@ include file = "footer.jsp" %>
</body>
</html>