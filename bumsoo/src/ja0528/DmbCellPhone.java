package ja0528;
//CellPhone�� �ڽ�Ŭ������ DmbCellphone
//��ӹ��:"�ڽ�Ŭ������extends �θ�Ŭ������"
public class DmbCellPhone {
//�ʵ弱��
	int channel;
	//�����ڼ���
	Dmbphone(String model,String color,int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
//�޼ҵ弱��
	void turnOnDmb() {
		System.out.println("ä��"+channel+"��Dmb�� ��û�մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	void turnoffDmb() {
		System.out.println("Dmb������ ����ϴ�.");
	}
}

