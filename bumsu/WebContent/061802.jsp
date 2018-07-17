<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입 폼 예제</h2>
<script type = text/javascript">
function join(){
	if(document.regist.name.value.length == 0){
		alert("이름을 입력해 주세요");
		register.name.focus();
		return false;
	}	
	else if(document.reg_frm.jumin.value.length! = 6){
		alert()
	}
	return true;
}/*필수 입력 조건
이름은 꼭 입력
주민번호 앞자리는 6자 뒷자리는 7자
아이디는 꼭 입력해야하고 4글자 이상이여야함
비밀번호도 꼭 입력해야 하고 비밀번호 입력 칸, 확인칸에 모두 동일한 값이 입력되야함*/
</script>
<form action="joinSerVelt" method = "post">
이름<span style = "color:red;">*</span>         <input type="text"name="name" id ="name"/></br>
<!-- name속성 :서버에서 사용하기 위해
id속성 : 현재 페이지에서 사용하기 위해 쓰는 일종의 변수명 -->
주민등록번호*    <input type="text"name="number"/> - <input type="text"name="number"/></br>
아이디 *       <input type="text"name="id"/></br>
비밀번호 *      <input type="text"name="pw"/></br>
비밀번호 확인*   <input type="text"name="pw check"/></br>
이메일                    <input type="text"name="mail"/> @ <input type="text"name="mail"/>
	<select name="select"> 
	<option value="선택">선택</option>
	<option value="nate.com">nate.com</option>
	<option value="naver.com">naver.com</option></select></br>
이메일 타입 사용 <input type ="email"name="email2">
<input type= "submit" value="회원가입" onclick= "return"	
	
우편번호                 <input type="text"name="postcode"/></br>
주소                       <input type="text"name="address"/>  <input type="text"name="address"/></br>
핸드폰번호              <input type="text"name="phonenumber"/></br>
<label>직업</label>
<select name="job">
<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
<option value="언론">언론</option>
<option value="공무원">공무원</option>
<option value="군인">군인</option>    
<option value="서비스업">서비스업</option></select></br>

메일/SNS정보수신  <input type="radio"name="check_mail"value="yes"/>수신
			 <input type="radio"name="check_mail"value="no"/>수신거부</br>
관심분야                 <input type="checkbox"name="attention">생두
<input type="checkbox"name="attention">원두
<input type="checkbox"name="attention">로스팅
<input type="checkbox"name="attention">핸드드립
<input type="checkbox"name="attention">에스프레소
<input type="checkbox"name="attention">창업
</br>

<input type="submit" value="회원가입"/>
<input type="submit" value="취소"/>
</form>
</body>
</html>