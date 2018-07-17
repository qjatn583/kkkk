package ja0607;

public class Car1 {
String company = "현대자동차";//company라는 변수에 현대자동차를 대입
String model;//model이라는 변수 선언
String color;//color이라는 변수 선언
int maxSpeed;//maxSpeed라는 변수 선언

//생성자
Car1(){
	
}
Car1(String model){
	this.model = model;//매개변수model설정
}
Car1(String model,String color){//필드 Car1에서 model,color의 정보를 가져온다
	this.model =model;//매개변수 model설정
	this.color=color;//매개변수color설정
}
Car1(String model,String color,int maxSpeed){//필드 Car1에서 model,color,maxSpeed의 정보를 가져온다
	this.model =model;
	this.color=color;
	this.maxSpeed=maxSpeed;
}
}
