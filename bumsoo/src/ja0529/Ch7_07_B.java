package ja0529;

public class Ch7_07_B {
	public void method() {
		System.out.println();
		//A클래스의 객체 생성
		Ch7_07_A a =new Ch7_07_A();
		//A클래스에서 선언한 필드에 접근 가능한지
		a.field="Value";
		//A클래스에서 선언된 메소드
		a.method();
	}
}
