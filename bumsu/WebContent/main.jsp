<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//세션에 있는 id를 확인해서 환영메세지
//관리자(admin)이 라면 회원목록링크를 띄움.
String id =null;
if(session.getAttribute("id")!=null){
	id =  (String)session.getAttribute("id");
	
}else{
	out.println("<script>");
	out.println("location.href='loginForm.jsp'</script>");
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>main.jsp 파일입니다.</h2>
<%=id%>님 환영합니다.
<!--관리자라면 회원목록을 보여줌.  -->
<%if(id.equals("ADMIN")){%>
	<a href = "member_list.jsp">관리자 모드 접속(회원 목록 보기)</a>
	<%}%>
}
</body>
</html>