package ja0608;

public class ComputerEXample {
public static void main(String[]args) {
	Computer myCom = new Computer();//Computer Ŭ�������� ������ ������ myCom�� ����
	
	int[]values1= {1,2,3}; //values1 �迭�� 1,2,3����
	int result1=myCom.sum1(values1);//result1�� myCom�� values1�� �հ踦 ����
	System.out.println("result1:"+result1);
	
	int result2 = myCom.sum1(new int[] {1,2,3,4,5});//result2�� new�����ڸ� �̿��Ͽ� �迭�� 1,2,3,4,5�� 
	//�����ش� 
System.out.println("result2:"+result2);

int result3=myCom.sum2(1,2,3);//result3�� 1+2+3�� ������ �������ش�
System.out.println("result3:"+result3);

int result4 = myCom.sum2(1,2,3,4,5);//result4�� 1+2+3+4+5�� ������ �����Ѵ�
System.out.println("result4:"+result4);


}
}
