
public class ch6_17_carEx {
public static void main(String[]args) {
	ch6_17_car car=new ch6_17_car();
	
	//car.speed=100;
	//setter�� ȣ���Ͽ� �ӵ� ���� ����
	car.setspeed(100);
	if(!car.isStop()) {
		car.setStop(true);
	}
	System.out.println("����ӵ�:"+car.getSpeed());
}
}
