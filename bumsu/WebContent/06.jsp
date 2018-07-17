<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>당신이 좋아하는 강아지를 선택하세요</h1>
<form action="dog" method = "post">
<!-- 체크박스로 강아지의 종류를 선택할수있도록구현 -->
<!-- 푸들을 선택하면 dog=pu.jpg형태로 서버로 전송됨 -->
<input type="checkbox"name="dog1"value="pu.jpg"/>
<input type="checkbox"name="dog1"value="jin.jpg"/>
<input type="checkbox"name="dog1"value="pung.jpg"/>
<input type="checkbox"name="dog1"value="shap.jpg"/>
<!-- 모든 체크박스에 체크한 후 선택을 클릭하면
dog[] = {pu.jpg ,jin.jpg pung.jpg sap.jpg}  -->
<input type="submit" value="선택"/>
</form>
</body>
</html>