package ja0529;

public class Ch07_06_SportsCar extends Ch7_06_Car {
	//speedUp메소드 정의
@Override
public void speedUp() {
	speed +=10;
	
}
//stop메소드 재정의
@Override
public void stop() {
	System.out.println("스포츠카 멈춤");
	speed=0;
	
}
}
