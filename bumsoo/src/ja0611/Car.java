package ja0611;
//p229
public class Car {
//필드
	int speed;//speed 필드값 생성
//메소드
	int getSpeed() {//getSpeed라는 메소드 생성
		return speed;//speed값 리턴
	}
	void keyTurnOn() {//keyTurnOn 메소드 생성
		System.out.println("키를 돌립니다.");
	}
	void run() {//run 메소드 생성
		for(int i=10;i<=50;i+=10) {//for문을 이용해서 i를10으로 초기화하고 50이하,10씩 증가
			speed = i;//speed는 i이다
			System.out.println("달립니다.(시속:"+speed+"km/h)");
		}
	}
}
