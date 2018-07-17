package ja0608;

public class Calculator {
int plus(int x,int y) {//plus의 메소드를 선언해주고 매개변수 x,y를 설정해준다
	int result = x+y;//result에 x+y대입
	return result;//result의 리턴값을 받는다
	
	
}
double avg(int x,int y) {//avg의 메소드를 선언해주고 매개변수x,y를 설정해준다
	double sum = plus(x,y);
	double result = sum/2; //result값에 sum/2값을 대입해준다
	return result;//result의 리턴값을 받는다
	
}
void execute() {//execute의 메소드 선언
	double result = avg(7,10);//result값에 avg(7,10)값을 대입
	println("실행결과:"+result);//결과 호출
}
void println(String message) {//위에 println문을 호출하고 message내용을 대입해준다
	System.out.println(message);
}
}
