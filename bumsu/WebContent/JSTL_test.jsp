<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

색상을 선택하세요.
<%session.setAttribute("test","testValue"); %>
<form action="JSRL_test2.jsp" method = "post">

<select name="job">
<option value="빨강">빨강</option>
<option value="파랑">파랑</option>
<option value="노랑">노랑</option>
<input type="submit" value="전송">
</select>
</body>
</html>