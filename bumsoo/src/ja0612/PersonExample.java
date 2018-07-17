package ja0612;

public class PersonExample {
public static void main(String[]args) {
	Person p1 = new Person("123456-1234567","계백");//Person 클래스에서 정보를 가져와 new연산자를 이용해 name,ssn의
	//정보를 입력해주고 그내용을 p1에 대입
	System.out.println(p1.nation);//p1안에있는 nation정보 호출
	System.out.println(p1.ssn);//p1안에있는 ssn정보호출
	System.out.println(p1.name);//p1안에있는 name정보호출
	
	p1.name = "을지문덕"
}
}
