<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<select>
<option>

</form>
</option>
</select>
<select multiple= "multiple">
<option>
</option>
</select>
<body>		
<h2>SelectExample.jsp파일입니다</h2>
<form action="SelectServlet" method = "post">
<label>직업</label>
<select name="job">
<option value="">선택하세요</option>
<option value="학생">학생</option>
<option value="개발자">개발자</option><!-- job="개발자" -->
<option value="공무원">공무원</option>
<option value="재벌">재벌</option>
<option value="신">신</option>
</select>

<label>관심분야</label>
<select name="interest"multiple" size = "5">
<option value="">선택하세요</option>
<option value="학생">학생</option>
<option value="개발자">개발자</option><!-- job="개발자" -->
<option value="공무원">공무원</option>
<option value="재벌">재벌</option>
<option value="신">신</option>
</select>
<input type="submit" value="전송">
</form>
</form>
</body>
</html>