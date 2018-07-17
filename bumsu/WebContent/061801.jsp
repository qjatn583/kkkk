<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.util.*,java.text.*" %>
    
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
200:OK. 에러없이 전송성공
400:Bad Request. 요청실패 문법상 오류가 있어서 서버가 요청사항을 이해하지못함
404:Not Found. 문서를 찾을수 없음. 클라이언트가 요청한 문서를 찾지 못하는 경우에 발생함.
	URL주소를확인하여 오타등이 없는 지 확인.
500:Internal Server Error.서버 내부 오류. 서버가 요청사항을 수행할수 없는 경우에 발생
	서버(Servlet)쪽에 문법상 오류 등이 없는지 확인.
503:Service Unavailable. 서비스 불가. 서버의 서비스가 멈춰있거나 일시적인 서버 과부하 상태
	인 경우에 발생.
	<%
	Date date = new Date();
	SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
	String strdate = simpleDate.format(date);
	%>
	오늘날짜는 <%= strdat %>입니다
</body>
</html>