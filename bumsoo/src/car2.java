
public class car2 {
	//필드선언
	String company="현대자동차";
	String model;
	String color;
	String maxSpeed;
	/*	
 * 여러종류의 생성자 선언하기
 * 1.기본생성자
 * 2.model을 매개변수로 하는 생성자
 * 3.model,color를 매개변수로 하는 생성자
 * 4.model,color,maxSpeed를 매개변수로 하는 생성자
 */
	car2(){}
	car2(String model){
		/*model = m;*/
		this(model,"은색","300");
	}
	car2(String model,String color){
		this.model = model;this.color = color;
	}
	car2(String model,String color,String maxSpeed){
		this.model = model;this.color = color;this.maxSpeed =maxSpeed;
	}
}
