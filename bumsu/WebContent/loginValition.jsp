<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String id,ps;
if(session.getAttribute("id")!=null){
id=(String)session.getAttribute("id");
}else{
	id="세션값 없음";
}
id=(String)session.getAttribute("id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--loginValidation.jsp의 역할  
1.클라이언트가 입력한 값을 가져오기
2.입력한 값과 사전에 지정한 아이디,비밀번호 값을 비교
3.비교후 틀린값이 없으면, 로그인 성공 및 main.jsp로 이동
3.1main.jsp로 이동하기 전에 입력받은 id를 세션에 저장
4.틀린값이 있다면 다시 로그인페이지로 이동-->
<%
/*로그인를 허용할 id,password 선언  */
String id="bumsu";
String ps="1234";
/* 클라이언트가 입력값을 가져오기 */
String login_id=request.getParameter("id");
String login_ps=request.getParameter("ps");

/*로그인 허용 여부 판단  */
if(id.equals(login_id)&&ps.equals(login_ps)){
	session.setAttribute("id",login_id);
	//메인으로 이동
	respons.sendRedirect("main0.jsp");
}else{
	

%>
<script>
alert("아이디,비밀번호가 틀립니다");
location.href="loginForm.jsp";


<%=request.getParameter("id") %>
<%=request.getParameter("ps") %>

</body>
</html>