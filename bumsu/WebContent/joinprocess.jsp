<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
    <%@page import="javax.sql.*" %>
    <%@page import="javax.naming.*" %>
    <%
    //joinform에서 입력한 내용을 받아와서 DB에 저장
    request.setCharacterEncoding("UTF-8");
    //joinform.jsp에서 입력한 내용 가져오기
    String id=request.getParameter("id");
    String password=request.getParameter("password");
    String name=request.getParameter("name");
    int age=integer.parseInt(request.getParameter("age"));
    String gender=request.getParameter("gender");
    String email=request.getParameter("email");
    %>
    <% //DB를 위한 변수 선언
    Connection conn =null;
    PreparedStatement pstmt =null;
    
    String sql="INSERT INTO MEMBER VALUES(?,?,?,?,?,?)";
    try{
    Context init = new InitialContext();
    DataSource ds =(DataSource)init.iookup("java:comp/env/jdbc/OracleDB");
    conn= ds.getConnection();
    
    //DB쿼리문 전송
    pstmt= conn.prepareStatement(sql);
    //쿼리문에 ?로 처리할 부분에 값을 대입
    pstmt.setString(1,id);//첫번째 ?에 id변수가 가진값을 대입
    pstmt.setString(2,password);
    pstmt.setString(3,name);
    pstmt.setInt(4,age);
    pstmt.setString(5,gender);
    pstmt.setString(6,email);
    //쿼리문 실행
    int result = pstmt.executeUpdate();
    //회원가입이 성공하면 loginform으로 가고 실패하면 joinform
    if(result!=0){
    	out.println("<script>");
    	out.println("location.href='loginForm.jsp'</script>");
    	
    }else{
    	out.println("<script>");
    	out.println("location.href='joinForm.jsp'</script>");
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
    }
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>joinprocess.jsp 파일입니다.</h2>

	
<%}
	%>	
</body>
</html>