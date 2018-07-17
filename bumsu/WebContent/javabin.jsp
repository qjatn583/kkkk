<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--class 속성값: 사용하고자 하는 클래스의 이름
    id속성값:현재페이지에서 사용할 class의 객체 이름.
      -->
      <!--
      name속성값:사용할 빈의 이름
      property속성값: 사용할 필드이름
      valus속성값: 사용할 필드의 필드값
        -->
<jsp:useBean id="beantest" class="test.BeanTest" scope="page"/>
<jsp:setProperty name="beantest" property="name"param="name"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--java bean
:JSP에서 관련있는 데이터를 저장하는 클래스를 정의하여 사용하기 위함

-->
<h2>beanTest1.jsp파일입니다.</h2>
<%=beantest.getName() %>
</body>
</html>