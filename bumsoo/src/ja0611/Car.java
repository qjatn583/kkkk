package ja0611;
//p229
public class Car {
//�ʵ�
	int speed;//speed �ʵ尪 ����
//�޼ҵ�
	int getSpeed() {//getSpeed��� �޼ҵ� ����
		return speed;//speed�� ����
	}
	void keyTurnOn() {//keyTurnOn �޼ҵ� ����
		System.out.println("Ű�� �����ϴ�.");
	}
	void run() {//run �޼ҵ� ����
		for(int i=10;i<=50;i+=10) {//for���� �̿��ؼ� i��10���� �ʱ�ȭ�ϰ� 50����,10�� ����
			speed = i;//speed�� i�̴�
			System.out.println("�޸��ϴ�.(�ü�:"+speed+"km/h)");
		}
	}
}
