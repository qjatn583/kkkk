package ja0611;

public class Car1 {
	//�ʵ�
String model;//model ��ü����
int speed;//speed��ü����

//������
Car1(String model){//Car1�� �Ű����� model ����
	this.model = model;//�����ڿ� �ִ� model�� �ʵ尪�� �ִ� model�� ����
}
//�޼ҵ�
void setSpeed(int speed) {//speed�� �Ű������� �����ϰ��ִ� setSpeed�޼ҵ� ����
this.speed=speed;//�޼ҵ�ȿ� �ִ� speed�� �ʵ尪�� �ִ� speed���� ����

}
void run() {
	for(int i=10;i<=50;i+=10) {//for���� �̿��ؼ� i��10���� �ʱ�ȭ�ϰ� 50�̻�,10������
		this.setSpeed(i);//�޼ҵ忡 �ִ� setSpeed�� ȣ���� speed �� ȣ��
 System.out.println(this.model+"�� �޸��ϴ�.(�ü�:"+this.speed+"km/h)");//�ʵ尪�� �ִ� model��, speed���� ȣ�� 
	}
}
}
