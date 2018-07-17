<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.* "%>
<%@page import="bean.BoardBean" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%ArrayList<BoardBean> boardList = (ArrayList<BoardBean>)request.getAttribute("boardList"); 

<!--페이징 정보 가져오기  -->
PageInfo pageInfo =(PageInfo)request.getAttribute("pageInfo");
 int nowPage = pageInfo.getPage();
 int startPage = pageInfo.getStartPage();
 int endPage = pageInfo.getEndPage();
 int MaxPage = pageInfo.getMaxPage();
 int ListCount = pageInfo.getListCountPage();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>날짜</td>
		<td>조회수</td>
	</tr>
	
	<c:forEach var="board" items="${boardList}">

	<tr>
		<td>${boardList.BOARD_NUM }</td>
		<td><a href = "boardDetail.bo?boardNum=${board.BOARD_NUM}">${board.BOARD_SUBJECT}</a></td>
		<td>${boardList.BOARD_SUBJECT }</td>
		<td>${boardList.BOARD_NAME }</td>
		<td>${boardList.BOARD_DATE }</td>
		<td>${boardList.BOARD_READCOUNT }</td>
	</tr>
	
	</c:forEach>
	
</table>
	<!--페이지 정보 출력 및 페이지 링크  -->
<%if(Page<=1){ %>
	[이전]&nbsp;
	<%}else{ %> 
	<a href ="boardList.bo?page=<%nowPage-1 %>">[이전]</a>&nbsp;
	<%} %>
	
	<%for(int a =startPage;a<=endPage;a++){
		if(a==nowPage){%>
		[<%=a %>]
		<%}else{ %>
		<a href = "boardList.bo?page=<%=a %>">[<%=a %>]</a>&nbsp;
		<%} %>
		<%} %>
		
		<%if(nowPage>=maxPage){ %>
		[다음]
		<%}else{ %>
		<a href = "boardList.bo?page=<%=nowPage+1%>">[다음]</a>&nbsp;
	}
</body>
</html>