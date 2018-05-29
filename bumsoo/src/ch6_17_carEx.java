
public class ch6_17_carEx {
public static void main(String[]args) {
	ch6_17_car car=new ch6_17_car();
	
	//car.speed=100;
	//setter를 호출하여 속도 값을 설정
	car.setspeed(100);
	if(!car.isStop()) {
		car.setStop(true);
	}
	System.out.println("현재속도:"+car.getSpeed());
}
}
