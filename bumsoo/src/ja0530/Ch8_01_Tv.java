package ja0530;
//�������̽� RemoteControl�� ����Ŭ����
public class Ch8_01_Tv implements Ch8_01_RemoteControl{
//�ʵ弱��
	private int volume;
	
//�������̽����� ������turnOn���� �޼ҵ� ����
	@override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	@override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	public void setVolume(int volume);
	if(volume>Ch8_01_RemoteControl.MAX_VOLUME) {
		this.volume=Ch8_01_RemoteControl.MAX_VOLUME;
	}else if(volume=Ch8_01_RemoteControl.MIN_VOLUME){
		this.volume=Ch8_01_RemoteControl.MIN_VOLUME;
	}else {
		this.volume = volume;
	}
	System.out.println("���� TV����:"+volume);
}
}
