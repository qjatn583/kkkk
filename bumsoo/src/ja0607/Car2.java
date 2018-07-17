package ja0607;

public class Car2 {
//필드선언
	String company = "현대자동차";//company라는 객체를 생성하고 현대자동차를 대입한다.
	String model;//model객체생성
	String color;//color객체생성
	int maxSpeed;//maxSpeed객체생성
	//생성자
	Car2(){
	}
	Car2(String model){
		this(model,"은색",250);
	}
	Car2(String model,String color){
		this(model,color,250);
	Car2(String model,String color,int maxSpeed){
		this.model= model;
		this.color= color;
		this.maxSpeed=maxSpeed;
	}
	}
}
