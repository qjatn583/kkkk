package ja0608;

public class Car {
	
int gas;//gas라는 변수 선언

void setGas(int gas) {//setGas안에 int gas를 대입해주는 메소드
	this.gas = gas;//클래스의 gas호출
}
boolean isLeftGas() {//isLeftGas의 true,false을 설정해준다
	if(gas==0) {//gas가 0일경우
		System.out.println("gas가 없습니다.");
		return false;//결과가 false = false값 리턴
		
	}
System.out.println("gas가 있습니다.");
return true;//true를 리턴
}

void run() {//리턴값이 없는 run메소드
	while(true) {
		if(gas>0) {
		System.out.println("달립니다.(gas잔량:"+gas+")");
		gas-=1;//gas가 1씩 감소된다.
	}else {
		System.out.println("멈춤니다.(gas잔량:"+gas+")");
		return;//메소드 실행 종료
	}
}
}
}