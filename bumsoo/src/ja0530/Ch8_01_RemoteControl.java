package ja0530;

public interface Ch8_01_RemoteControl {
//�������
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻�޼ҵ� ����
	//abstract�� ������ �ʾƵ� �ڵ����� �߻�޼ҵ�� �ν�
	//�������� ��ü�� ������ �ִ� �޼ҵ忡 ���� ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//������ �޼ҵ�
	//���� ��ü�� ������ �ִ� �޼ҵ��� ���೻����� �ۼ��� ������
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ�.");
		}else {
			System.out.println("���������մϴ�.");
		}
	}
//����(static)�޼ҵ�
	//��ü�� ��� �������̽����� �ٷ� ȣ���� ������ �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
