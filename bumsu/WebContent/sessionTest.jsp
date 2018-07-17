<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String name,id;
if(session.getAttribute("name")!=null){
name=(String)session.getAttribute("name");
}else{
	name="세션값 없음";
}
id=(String)session.getAttribute("id");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>sessionTest.jsp입니다.</h2>
<input type="button" onclick="location.href='sessionSet.jsp'"
value="세션값 저장">
<input type="button" onclick="location.href='sessionDel.jsp'"
value="세션값 삭제">
<input type="button" onclick="location.href='sessioninvalidate.jsp'"
value="세션값 초기롸">

<h3>name 값 출력: <%=name %></h3>
<h3>id값 출력:<%=id %></h3>
</body>
</html>