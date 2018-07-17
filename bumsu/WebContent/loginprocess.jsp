<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <%@page import="javax.sql.*" %>
    <%@page import="javax.naming.*" %>
    <%String id =request.getParameter("id");%>
   <% String password = request.getParameter("password");%>
    
    Connectionn conn =null;
    PrepareStatement pstmt = null;
    //DB로 부터 조회한 결과를 가져와서 처리하기 위한 ResultSet객체 사용
    ResultSet rs =null;
    //입력한 id에 해당하는 전체 정보를 조회
    String sql = "SELECT * FROM MEMBER WHERE ID=?";
    
    try{
        Context init = new InitialContext();
        DataSource ds =(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
        conn= ds.getConnection();
        
        //DB쿼리문 전송을 위한 준비
        pstmt= conn.prepareStatement(sql);
        pstmt.setString(1,id);
        rs = pstmt.executeQuery();
        if(rs.next()){
        	//비밀번호 검증
        	if(password.equals(rs.getString("password"))){
        		//비밀번호가 일치하면 id를 세션에 저장
        		session.setAttribute("id",id);
        		out.println("<script>");
            	out.println("location.href='main.jsp'</script>");
        	}
        }else{
        	out.println("<script>");
        }
    	out.println("location.href='login.jsp'</script>");
    }
    catch(Exception e){
        	e.printStackTrace();
        }finally{
        	try{
        		pstmt.close();
        		conn.close();
        	}catch(Exception e){
        		e.printStackTrace();
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

</body>
</html>