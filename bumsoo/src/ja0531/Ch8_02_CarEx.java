package ja0531;

public class Ch8_02_CarEx {
public static void main(String[]args) {
	Ch8_02_Car car = new Ch8_02_Car();
	car.run();
	System.out.println("-------------------");
	System.out.println("������ ���� ��ü ����");
	car.frontLeftTire = new Ch8_02_Kumho();
	car.run();
}
}
