package ja0611;

public class Car2 {
int speed;//speed��� ��ü����

void run() {//���ϰ��� �ʿ���� run�޼ҵ� ����
	System.out.println(speed+"���� �޸��ϴ�.");
}
public static void main(String[]args) {
	Car2 myCar = new Car2();//�����ִ�  Car2�� ������ ������ myCar�� ���� 
	myCar.speed = 60;//Car2�� �ִ� speed�� ȣ���ؼ� 60�̶�� ���� ����
	myCar.run();//Car2�� �ִ� run�޼ҵ��� ������ ������ myCar�� ����
	}
}
