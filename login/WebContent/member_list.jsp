<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.MemberBean" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%
	ArrayList<MemberBean> memberList = 
		(ArrayList<MemberBean>)request.getAttribute("memberList");

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
	<td colspan=2>회원목록(jsp 문법 사용)</td>
	</tr><%for(int i=0;i<memberList.size();i++){ %>
	<tr><td><a href="memberViewAction.me?id=<%=memberList.get(i).getId()%>">
				<%=memberList.get(i).getId()%></a></td>
	<td>
	<a href="memberDeleteAction.me?id=<%=memberList.get(i).getId()%>">삭제</a>
	</td></tr>
	<%} %>

</table>



<table>
	<tr>
		<td colspan=2><h1>회원 목록(jstl, EL 사용)</h1></td>
	</tr>
	<c:forEach var = "member" items = "${memberList}">
	<tr>
		<td>
		<!-- id는 클래스의 필드명과 동일하게(대소문자 구분) -->
			<a href="memberViewAction.me?id=${member.id}">
				${member.id}
			</a>
		</td>
		<td>
		<a href="memberDeleteAction.me?id=${member.id}">삭제</a>
		</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>









