package ja0611;

public class Calculator1Example {
public static void main(String[]args) {
	double result1 = 10*10*Calculator1.pi;//result1 값에 10*10*pi(Calculator1클래스에 있는pi)대입
	int result2= Calculator1.plus(10,5);//Calculator1클래스에 있는 plus를 result2에 대입
	int result3=Calculator1.minus(10,5);//Calculator1클래스에 있는 minus를 result3 대입
	
	System.out.println("result1:"+result1);
	System.out.println("result2:"+result2);
	System.out.println("result3:"+result3);
}
}
