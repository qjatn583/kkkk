
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>boardWrite.jsp파일입니다.</h2>

<form action="boardWritePro.bo" method="post" enctype="multipart/form-data" name="boardForm">
<table>

<tr>
   <td><label for="BOARD_NAME">글쓴이</label></td>
   <td><input type="text" name="BOARD_NAME" id="BOARD_NAME" size="20" required="required"></td>
</tr>

<tr>
   <td><label for="BOARD_PASS">비밀번호</label></td>
   <td><input type="password" name="BOARD_PASS" id="BOARD_PASS" size="15"></td>
</tr>

<tr>
   <td><label for="BOARD_SUBJECT">제목</label></td>
   <td><input type="text" name="BOARD_SUBJECT" id="BOARD_SUBJECT" size="50"></td>
</tr>

<tr>
   <td><label for="BOARD_CONTENT">글내용</label></td>
   <td><textarea name="BOARD_CONTENT" id="BOARD_CONTENT" cols="80" rows="20" size="2000" ></textarea></td>
</tr>

<tr>
   <td><label for="BOARD_FILE">파일업로드</label></td>
   <td><input type = "file" name = "BOARD_FILE" id="BOARD_FILE" size="50"></td>
</tr>
</table>
<table>
<tr>
   <td><input type="button" onclick="histroy.back(-1);" value="되돌아가기"></td>   
   <td><input type="reset" value="다시쓰기"></td>
</tr>
<tr>
<td rowspan="2"><input type="submit" value="등록"></td>
</tr>

</table>



</form>
   


</body>
</html>