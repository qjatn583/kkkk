package ja0529;

public class Ch07_06_SportsCar extends Ch7_06_Car {
	//speedUp�޼ҵ� ����
@Override
public void speedUp() {
	speed +=10;
	
}
//stop�޼ҵ� ������
@Override
public void stop() {
	System.out.println("������ī ����");
	speed=0;
	
}
}
