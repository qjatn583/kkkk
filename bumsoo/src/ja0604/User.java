package ja0604;
//����� ���� ����� ���� Ŭ����
public class User {
private String name;
//������ ����(Enumeration,enum)
private PayType payType;//payTpye������ �������� enum���� ������ ���븸 ������ �ִ�.

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
