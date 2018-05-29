package ja0528;
//부모클래스CellPhone
public class Cellphone {
//필드선언
	String model;
	String color;
	//메소드선언
	void PowerOn() {
		System.out.println("전원을켭니다.");
	}
	void PowerOff() {
		System.out.println("전원을끕니다.");
		
	}
	
	void bell() {
		System.out.println("벨이울립니다.");
		
	}
	
	void sendVoice(String message) {
		System.out.println("자기:"+message);
	}
	void receiveVoice() {
		System.out.println("전원을켭니다.");
	}
	
	
	
}
