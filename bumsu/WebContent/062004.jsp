<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>

</table>
<h2>property="*"테스트</h2>
<form action="propertyview.jsp" method = "post">
<label for="name">이름:</label>
<input type="text"name="name" id = "name"/><br>
<label for="address">주소:</label>
<input type="text"name="address"/><br>
<label for="email">이메일 주소:</label>
<input type="text"name="email"/><br>
<label for="name">생년월일:</label>
 <input type="text"name="birth"/><br>
<input type="submit" value="전송"/>
</form>
</body>
</html>