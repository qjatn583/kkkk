<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>el_Test.jsp파일입니다.</h2>
<!-- 
EL(Expression Language)
:${변수명}
 -->
 <%session.setAttribute("test","testValue"); %>
<form action="el_test1.jsp" method = "post">
이름: <input type="text" name="name">
<input type="submit" value="전송"/>
 </form>
</body>
</html>