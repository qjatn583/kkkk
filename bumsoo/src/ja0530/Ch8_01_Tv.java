package ja0530;
//인터페이스 RemoteControl의 구현클래스
public class Ch8_01_Tv implements Ch8_01_RemoteControl{
//필드선언
	private int volume;
	
//인터페이스에서 선언한turnOn실제 메소드 선언
	@override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	public void setVolume(int volume);
	if(volume>Ch8_01_RemoteControl.MAX_VOLUME) {
		this.volume=Ch8_01_RemoteControl.MAX_VOLUME;
	}else if(volume=Ch8_01_RemoteControl.MIN_VOLUME){
		this.volume=Ch8_01_RemoteControl.MIN_VOLUME;
	}else {
		this.volume = volume;
	}
	System.out.println("현재 TV볼륨:"+volume);
}
}
