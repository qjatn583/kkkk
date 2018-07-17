package ja0612;

public class Person {
final String nation = "Korea";//나중에 수정할수없는 필드, nation에다가 Korea 대입
final String ssn;//나중에 수정할수없는 필드m ssn선언
String name;//name 선언

public Person(String ssn, String name) {//person 메소드 선언하고 매개변수 ssn,name선언
	this.ssn=ssn;//ssn을 필드에 있는 ssn에 대입
	this.name=name;//name을 필드에 있는 name에 대입
}
}
		