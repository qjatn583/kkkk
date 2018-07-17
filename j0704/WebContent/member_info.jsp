<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>member_info.jsp</h2>
아이디:${member.id}<br>
비밀번호:${member.password}<br>
이름:${member.name}<br>
나이:${member.age}<br>
성별:${member.gender}<br>
이메일:${member.email}<br>
<a href = "memberListAction.me">리스트로 돌아가기</a>
</body>
</html>