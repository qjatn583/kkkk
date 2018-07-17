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
<h2>loginForm.jsp파일입니다</h2>
<h2>로그인 페이지</h2>
<form action="loginprocess" method = "post">
<table>
<label for "uesrid">아이디:</label>
<input type="text" name="id" id="userid"><br>
<label for "uesrps">비밀번호:</label>
<input type="password" name="ps" id="userps"><br>
<a href="name="loginForm" id = "login">
<p>로그인</p>
</table>
</a>
<a href="name="joinForm" id = "join">
<p>회원가입</p>
</a>
</form>


</body>
</html>