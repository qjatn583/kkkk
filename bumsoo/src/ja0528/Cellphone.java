package ja0528;
//�θ�Ŭ����CellPhone
public class Cellphone {
//�ʵ弱��
	String model;
	String color;
	//�޼ҵ弱��
	void PowerOn() {
		System.out.println("�������մϴ�.");
	}
	void PowerOff() {
		System.out.println("���������ϴ�.");
		
	}
	
	void bell() {
		System.out.println("���̿︳�ϴ�.");
		
	}
	
	void sendVoice(String message) {
		System.out.println("�ڱ�:"+message);
	}
	void receiveVoice() {
		System.out.println("�������մϴ�.");
	}
	
	
	
}
