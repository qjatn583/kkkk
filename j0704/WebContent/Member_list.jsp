<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.MemberBean" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
   <tr>
      <td colspan=2><h1>회원 목록</h1></td>
   </tr>
   <c:forEach var = "member" items = "${memberList}">
      <tr>
         <td>
            <a href="memberViewAction.me?id=${member.ID}">${member.ID}</a>
         </td>
         <td>
            <a href="memberDeleteAction.me?id=${member.ID}">삭제</a>
         </td>
      </tr>
   </c:forEach>
</table>
</body>
</html>