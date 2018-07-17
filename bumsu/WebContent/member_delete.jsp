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
    //ResultSet rs = null;
    
    String id_del = request.getParameter("id");
    
    String sql="DELETE * FROM MEMBER WHERE ID=?";
    try{
    	Context init = new InitialContext();
        DataSource ds =(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
        conn= ds.getConnection();
        
       
        pstmt= conn.prepareStatement(sql);
        pstmt.setString(1,id_del);
        rs = pstmt.executeQuery();
       
        out.println("<script>");
        out.println("location.href='member_list.jsp'</script>");
        
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
<h2>member_delete.jsp페이지입니다.</h2>
</body>
</html>