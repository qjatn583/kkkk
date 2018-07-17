<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>declarationTest.jsp파일입니다.</h2>

<!--선언문 :JSP페이지에서 멤버 변수 또는 메소드를 선언하기 위해 사용하는 방법  -->
<!--선언한 메소드 호출  -->
<h2><%= getstr() %></h2>
<%!
//메소드선언
private String getstr(){
	str +="테스트입니다.";
	return str;
}
private String str="선언문";
%>
</body>
</html>