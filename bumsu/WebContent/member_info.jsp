<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.sql.*" %>
    <%@page import="javax.sql.*" %>
    <%@page import="javax.naming.*" %>
    <%
    String id =null;
    if((session.getAttribute("id")==null)) ||
    	(!((String)session.getAttribute("id")).equals("ADMIN"))){
    		out.println("<script>");
    		out.println("location.href='login.jsp'</script>");
    		
    	}
    Connection conn = null;
    PreparedStatememt pstmt = null;
    ResultSet rs = null;
    //member_list.jsp 로 부터 넘겨 받은 id 값을 가져옴.
    String id_info= request.getParameter("id");
    String sql="SELECT * FROM MEMBER WHERE ID =?";
    try{
    	Context init = new InitialContext();
        DataSource ds =(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
        conn= ds.getConnection();
        
       
        pstmt= conn.prepareStatement(sql);
        pstmt.setString(1,id_info);
       
        rs = pstmt.executeQuery();
        rs.next();
    }catch(Exception e){
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
<h2>member_info.jsp파일입니다</h2>
<table>
<tr><td>아이디:</td>
<td><%=rs.getString("id") %></td></tr>
<tr><td>비밀번호:</td>
<td><%=rs.getString("password") %></td></tr>
<tr><td>이름:</td>
<td><%=rs.getString("name") %></td></tr>
<tr><td>나이:</td>
<td><%=rs.getString("age") %></td></tr>
<tr><td>성별:</td>
<td><%=rs.getString("gender") %></td></tr>
<tr><td>이메일:</td>
<td><%=rs.getString("email") %></td></tr>

<tr><td colspan=2><a href="member_list.jsp">
리스트로 돌아가기</a></td></tr>
</table>
</body>
</html>