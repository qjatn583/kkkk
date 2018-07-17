<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <%@page import="javax.sql.*" %>
    <%@page import="javax.naming.*" %>
    <%String id =request.getParameter("id");%>
   <%String password = request.getParameter("password");%>
     Connectionn conn =null;
    PrepareStatement pstmt = null;
     ResultSet rs =null;
    String sql = "SELECT * FROM MEMBER WHERE ID=?";
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method = "post">
<table>
<tr>
<td class ="td_Left">
<label for ="id">아이디:</label>
</td>
<td class="td_right">
<input type ="text" name ="id" id="id/
</td>
</td>
</body>
</html>