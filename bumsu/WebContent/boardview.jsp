<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%request.setCharacterEncoding("UTF-8"); %>
     <jsp:useBean id="beanTest" class="Test.board" scope="page"/>
    <jsp:setProperty property="*" name="beanTest"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>board.jsp</h2>
이름 <%=beanTest.getName() %><br>
주소 <%=beanTest.getPassword() %><br>
이메일 <%=beanTest.getEmail() %><br>
글제목 <%=beanTest.getWorkname() %><br>
글 내용 <%=beanTest.getContent() %><br>

<jsp:getProperty property="name" name="beanTest"/>

</body>
</html>