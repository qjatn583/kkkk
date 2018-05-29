
public class car2Example {
public static void main(String[]args) {
	/*1.기본 생성자를 이용한 객체 생성하여 필드값 출력
	2.model매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
	3. model,color매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
	4.model,color,maxSpeed 매개변수 작는 생성자를 이용한 객체 생성하여 필드값 출력*/

	car2 s1 = new car2();
	System.out.println("company:"+s1.company);
	System.out.println("model:"+s1.model);
	System.out.println("color:"+s1.color);
	System.out.println("maxSpeed:"+s1.maxSpeed);
	
	car2 s2 = new car2("그랜저");
	System.out.println("company:"+s2.company);
	System.out.println("model:"+s2.model);
	System.out.println("color:"+s2.color);
	System.out.println("maxSpeed:"+s2.maxSpeed);
	car2 s3 = new car2("그랜저","블랙");
	System.out.println("company:"+s3.company);
	System.out.println("model:"+s3.model);
	System.out.println("color:"+s3.color);
	System.out.println("maxSpeed:"+s3.maxSpeed);
	car2 s4 = new car2("그랜저","블랙","200");
	System.out.println("company:"+s4.company);
	System.out.println("model:"+s4.model);
	System.out.println("color:"+s4.color);
	System.out.println("maxSpeed:"+s4.maxSpeed);
	
		

}
}
