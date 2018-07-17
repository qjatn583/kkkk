<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>el_test1.jsp입니다.</h2>
<%request.setCharacterEncoding("UTF-8"); %>

JSP스트립틀릿 사용: <%=session.getAttribute("test") %><br>
EL사용: ${sessionScope.test}
pageScope
requestScepe
applicationScope
<h2>요청 파라미터 값 출력</h2>
JSP스트립틀릿 사용: <%=request.getParameter("name") %><br>
EL사용: ${param.name}
paramValues
<h2>값을 그대로 출력하기</h2>
${"그대로출력하기 "}
<%="그대로출력하기" %>

<h2>EL을 이용한 연산</h2>
${1+2}
${5-3}
${5*3}
${5/3}
${5==3}
${5!=3}
${5>3}
${5<3}
${5+3==8?:8:0}<br>

</body>
</html>