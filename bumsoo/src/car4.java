
public class car4 {
	//�ʵ弱��
	String model;
	//������ ����
	//�������� �̸��� Ŭ������ �����ϰ� ����
	car4(String model){
		//�Ѱܹ��� �Ű����� ���� ���� �ʵ忡 ����
		this.model=model;
	
	}
	//�޼ҵ� ����

	void run() {
		for(int i=10;i<=50;i+=10) {
			System.out.println(this.model+"�� �޸��ϴ�.(�ü�:"+i+"+km/s)");
		}
		
}
}
	
