package ja0611;

public class CarExample {
public static void main(String[]args) {
	Car myCar = new Car();//new�����ڸ� �̿��� CarŬ�������� ������ ������ mycar�� ����
	myCar.keyTurnOn();//CarŬ�������� keyTurnOn����ȣ��
	int speed = myCar.getSpeed();//CarŬ�������� getSpeed�� ���� ������ ������ speed�� ����
	System.out.println("����ӵ�:"+speed+"km/h");
}
}
