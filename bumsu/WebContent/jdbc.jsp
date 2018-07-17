<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <% Connection conn = null;
    String driver ="oracle.jdbc.driver.OracleDriver";
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    
    Boolean connect = false;
    try{ Class.forName(driver);
    conn=DriverManager.getConnection(url,"jdbc","1111");
    connect =true;
    conn.close();
    
    }catch (Exception e){
    	connect=false;
    	e.printStackTrace();
    	}
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>jdbctest.jsp 파일입니다.</h2>
<%if(connect=true){%>
	DB접속성공
	<%}else{ %>
	DB접속실패
<%} %>
</body>
</html>