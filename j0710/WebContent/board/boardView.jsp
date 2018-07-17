<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%String nowPage = (String)request.getParameter("page");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>boardView.jsp</h2>
<table border="1">

<tr>
<td>제목</td>
<td>${boardView.BOARD_SUBJECT }</td>
</tr>
<tr>
<td>첨부파일</td>
<td><a href = "boardFileDown.bo?downFile=${boardView.BOARD_FILE}">
${boardView.BOARD_FILE}</a></td>
</tr>
<tr>
<td>내용</td>
<td>${boardView.BOARD_CONTENT }</td>
</tr>
</table>
<a href="boardList.bo">목록</a>
<a href="boardModifyForm.bo?boardNum=${boardView.BOARD_NUM}">수정</a>
</body>
</html>