<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="java.sql.*" %>
    <%@page import="javax.sql.*" %>
    <%@page import="javax.naming.*" %>
    <%/*퀴리문은 student테이블의 모든내용 조회
    DB접속
    쿼리문실행*/%>
   <%
   Connection conn = null;
   String sql=
		   "SELECT* FROM STUDENT";
	String sql1 = "INSERT INTO STUDENT VALUES(99,'새로운이름')";
   PreparedStatement pstmt = null;
	//DB조회 결과를 담을 객체 선언
	ResultSet rs = null;
   try{
   Context init = new InitialContext();
   DataSource ds =(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
   conn = ds.getConnection();
   conn.setAutoCommit(false);
   
  // pstmt = conn.prepareStatement(sql);
  pstmt = conn.prepareStatement(sql1);
  rs = pstmt.executeQuery();
	out.println("데이터 삽입 완료");
  conn.rollback();
  out.println("롤백 완료");
  
   /*pstmt = conn.prepareStatement(sql,
		   ResultSet.TYPE_SCROLL_SENSITIVE,
		   ResultSet.CONCUR_UPDATABLE);*/
   
  
  
  //쿼리문 실행 결과를 ResultSet타입의 rs에 담음.
  /* rs = pstmt.executeQuery();
   int i=1;
   while(rs.next()){
	   //next() 메소드:DB테이블의 튜플(행)단위로 읽어오며,
	   //다음 튜플이 있다면 true,없다면 false를 반환
  rs.last();
	   out.println(rs.getInt(1)+","+rs.getString(2)+"<br>");
	   rs.first();
	   out.println(rs.getInt(1)+","+rs.getString(2)+"<br>");
	   rs.absolute(3);
	   out.println(rs.getInt(1)+","+rs.getString(2)+"<br>");
	   /* out.println(i+"번째 튜플의 num값"+rs.getInt(1));
	   out.println(i+"번째 튜플의 name값"+rs.getString(2)+"<br>");
	   i++;
   } */
   }catch(Exception e){
	   out.println("<h2>데이터 조회 실패</h2>");
	   e.printStackTrace();

}finally{
	try{
		rs.close();
		pstmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>