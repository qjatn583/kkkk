<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="upload2.jsp" method="post"
enctype="multipart/form-date">

<table>
<tr>
<td colspan="2" class ="td_title"></td>
</tr>
<tr>
<td><label for = "name">올린사람:</label></td>
<td><input type="text" name="name" id="name"></td><br>
</tr>
<tr>
<td><label for="subject">제목:</label></td>
<td><input type="text" name="subject" id="subject"></td>
</tr>
<tr>
<td><label for="subject">파일명1:</label></td>
<td><input type="file" name="subject" id="fileName1"></td>
</tr>
<tr>
<td><label for="subject">파일명2:</label></td>
<td><input type="file" name="subject" id="fileName2"></td>
</tr>
<tr>
<td colspan=2 align=center><input type="submit" value="전송"></td>
</tr>
</table>


</form>
</body>
</html>