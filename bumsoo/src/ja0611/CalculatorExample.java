package ja0611;

public class CalculatorExample {
public static void main(String[]args) {
	Calculator myCalcu= new Calculator();//new연산자를 이용해 Calculator클래스의 정보를 가져와 myCalcu에 대입
	//정사각형의 넓이구하기
	double result1 = myCalcu.areaRectangle(10);//Calculator클래스에서 정보를 가져와 areaRectangle에서 
	//리턴값을 가져와 10*10의 정보를 result1에 대입
	//직사각형의 넓이 구하기
	double result2 =myCalcu.areaRectangle(10,20 );//Calculator클래스에서 정보를 가져와 areaRectangle에서
	//리턴값 width*height값을 호출해 10*20의 정보를 result2값에 대입
	//결과 출력
	System.out.println("정사각형의 넓이="+result1);
	System.out.println("직사각형의 넓이="+result2);
}
}
