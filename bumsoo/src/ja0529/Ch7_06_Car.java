package ja0529;

public class Ch7_06_Car {
//필드,메소드,final메소드
	public int speed;
	public void speedup() {
		speed +=1;
	};
	//final메소드
	public final void stop() {
		System.out.println();
	}
	//SportsCar클래스 선언 메소드,final메소드 재정의
}
