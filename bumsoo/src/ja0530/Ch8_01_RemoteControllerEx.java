package ja0530;

public class Ch8_01_RemoteControllerEx {
public static void main(String[]args) {
	//인터페이스 타입의 변수 선언
	Ch8_01_RemoteControll rc;
	//각각의 객체를 인터페이스 타입 변수에 대입
	//따라서 rc는 Tv객체가됨
	rc=new Ch8_01_Tv();
	rc.turnOn();
	rc.turnOff();
	rc.setMute(true);
	rc=new Ch8_01_Audio();
	rc.turnOn();
	rc.turnOff();
	rc.setMute(true);
	Ch8_01_RemoteControl.changeBattery();
	
}
}
