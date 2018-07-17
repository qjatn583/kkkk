<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page import="java.sql.*" %>
    <%@page import="javax.sql.*" %>
    <%@page import="javax.naming.*" %>
<%Connection conn = null;
String sql=
"INSERT INTO STUDENT VALUES(?,?)";
PreparedStatement pstmt = null;

try{
Context init = new InitialContext();
DataSource ds =(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
conn = ds.getConnection();
pstmt = conn.prepareStatement(sql);
pstmt.setInt(1,100);
pstmt.setString(2,"새로운이름");
pstmt.executeUpdate();
	
/*for(int i=2;i<=5;i++){
pstmt.setInt(1,i);
if(pstmt.executeUpdate()!=0){
	out.println("<h2>"+i+"번 데이터 삽입 성공.</h2>");
}
}*/

}catch(Exception e){
	out.println("<h2>데이터 삽입 실패</h2>");
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