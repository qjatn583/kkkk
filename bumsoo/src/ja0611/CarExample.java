package ja0611;

public class CarExample {
public static void main(String[]args) {
	Car myCar = new Car();//new연산자를 이용해 Car클래스에서 정보를 가져와 mycar에 대입
	myCar.keyTurnOn();//Car클래스에서 keyTurnOn정보호출
	int speed = myCar.getSpeed();//Car클래스에서 getSpeed에 대한 정보를 가져와 speed에 대입
	System.out.println("현재속도:"+speed+"km/h");
}
}
