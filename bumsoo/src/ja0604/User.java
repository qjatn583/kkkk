package ja0604;
//사용자 정보 등록을 위한 클래스
public class User {
private String name;
//열거형 변수(Enumeration,enum)
private PayType payType;//payTpye변수는 변수값을 enum에서 정의한 내용만 가질수 있다.

public User(String name,PayType paytype) {
	this.name = name;
	this.payType= paytype;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public PayType getPayType() {
	return payType;
}

public void setPayType(PayType payType) {
	this.payType = payType;
}
}
