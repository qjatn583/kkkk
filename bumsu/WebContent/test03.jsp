<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="RadioServelt" method = "post">
<label for="gender_id">성별:</label>
<input type="radio"name="gender"value=남자 checked>남자<input type="radio"name="gender"value=여자/>여자</br>
<label for="gender_id">메일 정보 수신 여부:</label>
<input type="radio"name="check_mail"value="yes"/>수신<input type="radio"name="check_mail"value="no"/>거부</br>
<label for="gender_id">가입인사:</label>
<textarea id="content" name="contents" row="3" cols="30"></textarea>
<input type="submit"name="전송"/>
</form>
</body>
</html>