<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%Cookie cookie =new Cookie("name","yourname") ;
    cookie.setMaxAge(600);
    response.addCookie(cookie);
    %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>cookieTest.jsp 파일입니다</h2>
<!-- 쿠키(cookie)
클라이언트에서 관리되는 정보
:(새션은 서버에서 관리되는 정보)
:퀴 정보는 브라우저를 종료해도 하드디스크에 저장돠기 때문에
생존 기간이 지정되면 그 기간동안 사라지지 않음
:따라서 보안에는 취약한부분이 있음.
:보안이 요구되는 경우에는 세션을 사용
:로그인할때 로그인 창에 그동안 사용했던 아이디가 나오는 것이 쿠키 정보가
있기때문에 가능한 거임 -->
<h2>쿠키값출력</h2>
<%=cookie.getName() %>
<%=cookie.getValue() %>
<%=cookie.getMaxAge() %>
<a href=cookieTest2.jsp></a>
</body>
</html>