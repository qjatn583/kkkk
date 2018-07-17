package ja0611;

public class Car1 {
	//필드
String model;//model 객체생성
int speed;//speed객체생성

//생성자
Car1(String model){//Car1에 매개변수 model 생성
	this.model = model;//생성자에 있는 model을 필드값에 있는 model에 대입
}
//메소드
void setSpeed(int speed) {//speed의 매개변수를 포함하고있는 setSpeed메소드 선언
this.speed=speed;//메소드안에 있는 speed를 필드값에 있는 speed값에 대입

}
void run() {
	for(int i=10;i<=50;i+=10) {//for문을 이용해서 i는10으로 초기화하고 50이상,10씩증가
		this.setSpeed(i);//메소드에 있는 setSpeed를 호출해 speed 값 호출
 System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");//필드값에 있는 model값, speed값을 호출 
	}
}
}
