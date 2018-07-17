package ja0611;

public class Car2 {
int speed;//speed라는 객체선언

void run() {//리턴값이 필요없는 run메소드 생성
	System.out.println(speed+"으로 달립니다.");
}
public static void main(String[]args) {
	Car2 myCar = new Car2();//위에있는  Car2의 정보를 가져와 myCar에 대입 
	myCar.speed = 60;//Car2에 있는 speed를 호출해서 60이라는 값을 대입
	myCar.run();//Car2에 있는 run메소드의 정보를 가져와 myCar에 대입
	}
}
