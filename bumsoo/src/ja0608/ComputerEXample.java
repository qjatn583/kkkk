package ja0608;

public class ComputerEXample {
public static void main(String[]args) {
	Computer myCom = new Computer();//Computer 클래스에서 정보를 가져와 myCom에 대입
	
	int[]values1= {1,2,3}; //values1 배열에 1,2,3대입
	int result1=myCom.sum1(values1);//result1에 myCom에 values1의 합계를 대입
	System.out.println("result1:"+result1);
	
	int result2 = myCom.sum1(new int[] {1,2,3,4,5});//result2에 new연산자를 이용하여 배열에 1,2,3,4,5를 
	//더해준다 
System.out.println("result2:"+result2);

int result3=myCom.sum2(1,2,3);//result3에 1+2+3의 정보를 대입해준다
System.out.println("result3:"+result3);

int result4 = myCom.sum2(1,2,3,4,5);//result4에 1+2+3+4+5의 정보를 대입한다
System.out.println("result4:"+result4);


}
}
