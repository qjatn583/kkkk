<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>joinform.jsp 회원가입</h2>


<td><form name=joinform" action="joinprocess.jsp" method = "post">
<tr>

<td><label for ="id">아이디:</label></td>
<td><input type="text" name ="id" id="id"></td>


<td><label for ="pass">비밀번호:</label></td>
<td><input type="text" name ="pass" id="pass"><br>

<td><label for ="name">이름:</label>
<td><input type="text" name ="name" id="name"><br>

<td><label for ="age">나이:</label>
<td><input type="text" name ="age" id="age"><br>

<td><label for ="gender">성별:</label>
<td><input type="radio" name ="gender" value="남" check id="gender1">남자
<td><input type="radio" name ="gender" value="여" id="gender2">여자
</td>
<label for ="email">비밀번호:</label>
<input type="text" name ="email" id="email"><br>
</tr>
<tr>
<td colspan="2">
<a href="javascript:joinform.submit()">회원가입</a>
<a href="javascript:joinform.reset()">다시작성</a>

<input type="submit" value="전송"/>
</form>
</body>
</html>