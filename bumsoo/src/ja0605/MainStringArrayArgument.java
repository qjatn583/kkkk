package ja0605;

public class MainStringArrayArgument {
public static void main(String[]args) {
	
	if(args.length!=2) {//args의 길이가 2가 아닐경우
	System.out.println("프로그램사용법");
	System.out.println("java MainStringArrayArgument num1 num2");
	System.exit(0);//프로그램 강제종료
}
String strNum1 = args[0];//args[0]을 String변수인 strNum1에 넣어준다
String strNum2 = args[1];//args[1]을 String변수인 strNum2에 넣어준다

int num1 = Integer.parseInt(strNum1);//strNum1을 정수로 변환해서 num1에 넣어준다
int num2 = Integer.parseInt(strNum2);//strNum2을 정수로 변환해서 num2에 넣어준다
	
int result = num1+num2;//result(결과)의 변수에 num1과num2를 더한값을 넣어준다
System.out.println(num1+"+"+num2+"="+result);//num1+num2더한값을 호출
}
}
