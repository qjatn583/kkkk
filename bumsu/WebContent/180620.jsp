<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 액션태그
의미:JSP페이지에서 자바코드등을 사용하지 않고도 다른 페이지의 서블릿이나 자바빈의 객체에 접근할수있도록 태그를 이용해 구현된 기능
종류:forward,include,useBean(자바빈은 나중에 뒤에서) 액션태그 등
 -->

<h2>forwardTest.jsp파일입니다 </h2>
forwardTest.jsp파일로 입력한 정보를 전송
<form action="forwardTest1.jsp" method=post>
<input type="hidden" name="forwardPage" value="forwardTest2.jsp">

 이름:<input type="text" name="name">
 나이:<input type="text" name="age">
 주소:<input type="text" name="address">
 <input type="submit" value= "전송">
 </form>
</body>
</html>