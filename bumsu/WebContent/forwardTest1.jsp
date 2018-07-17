<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>forwardTest1.jsp파일입니다.</h2>
<!--forward 액션 태그 사용  -->
<jsp:forward page='<%=request.getParameter("forwardPage") %>'>
<jsp:param  name="tel" value="032-123-4567"/>
<jsp:param value="" name=""/>
</jsp:forward>
</body>
</html>