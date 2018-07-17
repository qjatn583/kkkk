package ja0530;

public class Ch7_12_PhoneEx {
public static void main(String[]args) {
	//자식클래스의 객체 생성
	Ch7_12_SmartPhone smartphone = new Ch7_12_SmartPhone("소유자");
	//추상클래스의 객체 생성
	//Ch7_12_Phone phone = new Ch7_12_Phone("소유자");
	
	smartphone.turnOn();
	smartphone.turnOff();
}
}
