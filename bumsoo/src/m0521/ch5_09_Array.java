package m0521;

import java.util.Scanner;

public class ch5_09_Array {


public static void main(String[]args) {
	/*
	 * ����
	 * ��� 5���� �Է� �޾Ƽ� �迭�� �����ϰ�,
	 * �Է� ���� �� �� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
	Scanner scanner = new Scanner(System.in);
	/*int [] arr=new int[4];
	
	int max=0;
	System.out.println("��� 5���� �Է��ϼ���");
	for(int i=0;i<=arr.length;i++) {
		
		arr[i] = num.nextInt();

		if(max<arr[i])
			max=arr[i];
	}
	System.out.println("max:"+max);*/
 int[] intArray= new int[5];
 //�ִ밪 ���� ���� ����
 int max=0;
 System.out.println("��� 5���� �Է��ϼ���.");
 for(int i=0; i<intArray.length;i++) {
	 
	intArray[i]= scanner.nextInt();
	 if(intArray[i]>max)
		 max=intArray[i];
	 System.out.println("���� ū����"+max+"�Դϴ�.");
 }
 
	 
	
}
}
