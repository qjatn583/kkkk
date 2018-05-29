package ja0528;

public class Computer {
	//부모클래스에서 선언한areaCircle메소드를 재정의함.
	//굳이@override를 쓰지 않아도 알아서 메소드 재정의가 된 것으로 인지하지만
	//컴파일러에게 정확한 지시를 위해 사용.
double areaCircle(double r) {
	System.out.println("Computer객체의 areaCircle()실행");
	return Math.PI*r*r;
}
}
