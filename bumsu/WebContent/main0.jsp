<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(session.getAttribute("id")==null){
	response.sendRedirect("loginForm.jsp");
}else{%>
	
<%=session.getAttribute("id") %> 반갑습니다.
</body>
</html>