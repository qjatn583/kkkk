<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>LoginForm.jsp 파일입니다.</h2>
<form action="./memberLoginAction.me" method="post" name = "LoginForm">
<table width="400" align="center">
      <tr><th colspan="2">로그인</th></tr>
      <tr><td><label for = "id">아이디:</label></td>
      <td><input type="text" name = "id" id = "id"/></td></tr>
      <tr><td><label for = "password">비밀번호:</label></td>
      <td><input type="password" name = "password" id = "password"/></td></tr>
       <td colspan="2">
       <a href="javascript:LoginForm.submit()">로그인</a>&nbsp;&nbsp;
         <a href="memberJoin.me">회원가입</a>
      </td>
      </tr>
   </table>
   </form>
</body>
</html>