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


<c:if test="${param.color==1}">
<span style="color:red;">빨강</span>
</c:if>
<c:if test="${param.color==1}">
<span style="color:red;">파랑</span>
</c:if>
<c:if test="${param.color==1}">
<span style="color:red;">노랑</span>
</c:if>

<c:choose>
<c:when test="${param.color==1}">
<span style="color:red;">빨강</span>
</c:when>
<c:when test="${param.color==1}">
<span style="color:red;">파랑</span>
</c:when>
<c:when test="${param.color==1}">
<span style="color:red;">노랑</span>
</c:when>
</c:choose>
</body>
</html>