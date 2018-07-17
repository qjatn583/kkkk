<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
td{
}
#rowStyle{
font-weight:bold;/*  굵게*/
backgroung-color:#6F9C93;/* 배경색 지정 */
text-align:center;/*중앙정렬  */
}
h2{text-align:center;
}
#command{text-align:center;}
table{
margin:auto;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시판 글쓰기</h2>
<form action="boardview.jsp" method = "post">
<td id="rowstyle">작성자:</td>
<input type="text"name="name" id = "name"/><br>
<td id="rowstyle">비밀번호:</td>
<input type="text"name="password"/><br>
<td id="rowstyle">이메일:</td>
<input type="text"name="email"/><br>
<td id="rowstyle">글제목:</td>
 <input type="text"name="workname"/><br>
<td id="rowstyle">글내용:</td>
 <input type="text"name="content"/><br>
 <section id = "command">
<input type="submit" value="전송"/>
<input type="reset" value="다시작성"/>
</form>
</body>
</html>