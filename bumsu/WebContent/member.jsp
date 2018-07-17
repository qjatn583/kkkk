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
    DataSource ds =(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
    conn =ds.getConnection();
    pstmt =conn.prepareStatement(sql);
    rs = pstmt.executeQuery();
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>member_list.jsp파일입니다.</h2>
<!--회원 목록을 출력,회원아이디에 링크를 걸어서 링크를 클릭하면 해당 회원의 상세 페이지로 이동  -->
<table>
<tr><td colspan=2>회원목록</td></tr>
<%while(rs.next()){%>
	<tr>
	<!--상세페이지를 보기 위한 링크  -->
	<td><a href="member_info.jsp?id=<%=rs.getString("id") %>">
	<%=rs.getString("id") %></a></td>
	<!--회원정보 삭제를 위한 링크  -->
	<td><a href="member_delete.jsp?id=<%=rs.getString("id") %>">
	삭제 </a></td>
	</tr>
<%}%>
	

</table>
</body>
</html>