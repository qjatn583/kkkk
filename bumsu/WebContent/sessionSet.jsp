<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>sessionSet.jsp파일입니다.</h2>
<%session.setAttribute("name","Session Test!"); %><!-- Session Test값을 할당한다 -->
<script>
location.href=sessionTest.jsp
</script>
</body>
</html>