package ja0529;
//필드의 다형성 예제
public class Ch7_09_Tire {//타이어클래스
	
	//필드선언
public int maxRotation;//최대 회전수
public int accumulatedRotation;//누적 회전수
public String location;//타이어의 위치
//생성자
public Ch7_09_Tire(String location,int maxRotation) {
	this.location=location;//location을 초기화
	this.maxRotation=maxRotation;//maxRotation을 초기화
//메소드	
	//Tire frontLeftTire = new Tire("앞왼쪽",6);
	//Tire frontRightTire = new Tire("앞오른쪽",2);
	//Tire backLeftTire = new Tire("뒤왼쪽",3);
	//Tire backRigftTire = new Tire("뒤오른쪽",4);
public boolean roll() {
	//accumulatedRotation의 초기값은 0
	++accumulatedRotation;//누적 회전수 1증가
	//accumulatedRotation은 1이고maxRotation6이다.
	//accumulatedRotation은 1이고maxRotation2이다.
	if(accumulatedRotation<maxRotation) {//최대 회전수가 누적회전수보다 클경우
		System.out.println(location+"Tire 수명:"+//타이어의 위치+타이어의 수명
				(maxRotation-accumulatedRotation)+"회");//최대회전수-누적회전수=회
		
		return true;
	}else{
		System.out.println("***"+location+"Tire펑크***");//최대 회전수를 초과한 타이어 위치는 펑크가 난다
		return false;
	}
}
}
}
