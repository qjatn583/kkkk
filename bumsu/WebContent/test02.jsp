<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
public int sum(){
int total=0;
for(int i=0;i<=100;i++){
	total+=i;
}
return total;
%>
<%
String str="1부터100까지의 합";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><%=str %>은 <b><%=sum() %></b>입니다. </h2>
<br>
<h2><%=str %>에 3을 곱하면 <b><%=sum()*3 %></b>이 됩니다.</h2>
<br>
</body>
</html>