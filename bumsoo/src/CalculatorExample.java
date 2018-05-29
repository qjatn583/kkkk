
public class CalculatorExample {
public static void main(String[]args) {
	/*Calculator객체생성
	 * powerOn메소드 호출
	 * plus메소드 호출(매개 값은 알아서)및 호출 결과 출력
	 * divide메소드 호출(매개값은 알아서)및 호출 결과 출력
	 * powerOff메소드 출력*/
	Calculator s1= new Calculator();
	s1.PowerOn();
	int result = s1.plus(10, 20);
	System.out.println(result);
	 
	 double result1 = s1.divide(10,20);
	 System.out.println(result1);
	 
	 s1.PowerOff();
	 
 }
 
 }

