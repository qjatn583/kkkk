package ja0530;

public class Ch8_01_RemoteControllerEx {
public static void main(String[]args) {
	//�������̽� Ÿ���� ���� ����
	Ch8_01_RemoteControll rc;
	//������ ��ü�� �������̽� Ÿ�� ������ ����
	//���� rc�� Tv��ü����
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
