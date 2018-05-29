
public class carExample {
public static void main(String[]args) {
	/*Car 클래스 객체 선언
	 * Car클래스에서 선언한 필드값을 출력해보세요.*/
	car s1=new car();
	System.out.println(s1.company);
	System.out.println(s1.model);
	System.out.println(s1.color);
	System.out.println(s1.maxspeed);
	/*필드값 변경
	 * int number=10;
	 * number=30;
	 */
	s1.speed=60;
	System.out.println(s1.speed);
}
}
