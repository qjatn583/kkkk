package ja0530;

public class Ch7_11_InstanceofEx {
	public static void method(Ch7_11_Parent parent) {
		//parent변수가 Ch7_11_Child 클래스 타입인지?
		if (parent instanceof Ch7_11_Child) {
			//parent변수를 Child클래스타입으로 강제변환해서
			//Child클래스 타입의 변수 child에 대입한다.
			Ch7_11_Child child=(Ch7_11_Child)parent;
			System.out.println("method1-Child로 변환 성공");
		}else {
			System.out.println("method2-Child로 변환되지않음");
		}
	}
	public static void method2(Ch7_11_Child parent1) {
		System.out.println("method2 - Child로 변환 성공");
	}
public static void main(String[]args) {
	/*객체 타입 확인을 위한 instanceof연산자
	 * 강제타입변환이 가능한지 여부를 판단하기 위해 사용하는 연산자*/
	/*Parent 타입의 변수를 선언해서 Child객체를 대입
	 *method1,2를 각각호출
	 *Parent타입을 변수를 선언해서Parent객체를 대입
	 *method1,2를 각각호출*/
	Ch7_11_Child parent1 = new Ch7_11_Child();
	method1(parent1);
	method2(parent1);
	Ch7_11_Child parent2 = new Ch7_11_Child();
	method1(parent2);//오류는 없지만 변환은 안됨
	method2(parent2);//오류
}
private static void method1(Ch7_11_Child parent1) {
	// TODO Auto-generated method stub
	
}
}
