<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String[] matchList = {"브라질:멕시코","벨기에:일본","스웨덴:스위스","콜롬비아:잉글랜드"};
pageContext.setAttribute("matchList",matchList);
%>
<c:forEach var "match" items="${pageScope.matchList}"
	varStatus="sts">
	${sts.index}
	${sts.count}
${match}<br>
</c:forEach>


</body>
</html>