package ja0607;

public class CalculatorExample {
public static void main(String[]args) {
	Calculator myCalc = new Calculator();//Calculator클래스에서 정보를가져와 mycalc객체 생성
	myCalc.powerOn();//Calculator의 powerOn정보를 가져온다
	 int result1 = myCalc.plus(5, 6);//result1에 Calculator의 정보를 가져와 5+6을 한 결과를 대입한다
	 System.out.println("result1:"+result1);
	 
	 byte x = 10;
	 byte y = 4;
	 double result2=myCalc.divide(x, y);//result2에 Calculator의 정보를 가져와 x/y한 결과 대입
	 System.out.println("result2:"+result2);
	
	 myCalc.powerOff();//Calculator의 정보를 가져와 poweOff의 정보를 가져옴
}
}
