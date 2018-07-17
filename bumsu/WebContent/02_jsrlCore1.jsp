<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ tablib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>02_jsrlCore1.jsp파일입니다.</h2>
<!--JSTL(JSP Standard tag Library)  -->
변수값 설정:<c:set var="test" value="HELLO JSTL!" />
변수값 출력:<c:out vlaue="${test}"/>
변수값 삭제:<c:remove var="test"/>
변수값 출력:<c:out vlaue="${test}"/>

<c:if test="${5<10}">
5는10보다 작다.
</c:if>

<c:if test="${6+3==9}">
6+3은 9다.
</c:if>
<hr>
<c:choose>
<c:when test="${5+10==50}">
5+10은 50이다.
</c:when>
<c:otherwise>
5+10은 50이 아니다.
</c:otherwise>
</c:choose>

<c:forEach var="test" begin="1" end="10" step="2">
test값 출력:${test}<br>
</c:forEach>

<c:forEach var="test" items="a,b,c,d,e,f">
test값 출력: ${test}<br>
</c:forEach>
</body>
</html>