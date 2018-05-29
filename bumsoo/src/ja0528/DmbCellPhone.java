package ja0528;
//CellPhone의 자식클래스인 DmbCellphone
//상속방법:"자식클래스명extends 부모클래스명"
public class DmbCellPhone {
//필드선언
	int channel;
	//생성자선언
	Dmbphone(String model,String color,int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
//메소드선언
	void turnOnDmb() {
		System.out.println("채널"+channel+"번Dmb를 시청합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	void turnoffDmb() {
		System.out.println("Dmb수신을 멈춥니다.");
	}
}

