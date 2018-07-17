<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String name="";
    String value="";
    String cookie=request.getHeader("cookie");
    
    if(cookie!=null){
    	
    	Cookie cookies[]=request.getCookies();
    	for(int i=0;i<cookies.length;i++){
    		if(cookies[i].getName().equals("name")){
    			name=cookies[i].getName();
    			value=cookies[i].getValue();
    		}
    	}
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>cookieTest2.jsp파일입니다</h2>
쿠키이름:<%=name %>
쿠키 값: <%=value %>
</body>
</html>