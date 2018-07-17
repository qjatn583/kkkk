<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    
    <jsp:useBean id="beanTest" class="property.property" scope="page"/>
    <jsp:setProperty property="*" name="beanTest"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>property.jsp</h2>
이름:<%=beanTest.getName() %><br>
주소:<%=beanTest.getAddress() %><br>
이메일:<%=beanTest.getEmail() %><br>
생년월일:<%=beanTest.getBirth() %><br>
 
입력한 이름 출력:<%=request.getParameter("name") %><br>
<!--액션태그를 이용한 입력받은 값 출력하기  -->
<jsp:getProperty property="name" name="beanTest"/>
</body>
</html>