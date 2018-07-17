package ja0607;

public class Calculator {
//메소드
	void powerOn() {//powerOn은 리턴값이 없으므로 void
		System.out.println("전원을켭니다");
	}
	int plus(int x, int y) {//plus라는 메소드를 선언하고 x,y값을 넣어준다
		int result = x+y;//result값에 x+y를 넣어준다
		return result;//plus는 결과값이 있으므로 위에있는 result값을 return해준다
		
	}
		double divide(int x,int y) {//divide라는 메소드를 선언하고 x,y값을 넣어준다
			double result =(double)x/(double)y;//result값에 x,y를 넣어주는데 x,y가 int 값이라 double로 변환해준다
			return result;//divide는 결과값이 있으므로 result값을 return해준다.
			
	}
	void powerOff() {//powerOff라는 메소드를 선언해준다
		System.out.println("전원을 끕니다");
	}
}
