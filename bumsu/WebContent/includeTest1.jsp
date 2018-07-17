<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--include 액션태그  -->
<h2>includeTest1.jsp 파일입니다.</h2>
<jsp:include page="02_includeTest2.jsp"></jsp:include>
	<jsp:param value="kimbumsu name="name"/>
	</jsp:include>
	<hr>
</body>
</html>