package m0521;

import java.util.Scanner;

public class ch5_09_Array {


public static void main(String[]args) {
	/*
	 * 문제
	 * 양수 5개를 입력 받아서 배열에 저장하고,
	 * 입력 받은 수 중 가장 큰 수를 출력하는 프로그램을 작성하시오.*/
	Scanner scanner = new Scanner(System.in);
	/*int [] arr=new int[4];
	
	int max=0;
	System.out.println("양수 5개를 입력하세요");
	for(int i=0;i<=arr.length;i++) {
		
		arr[i] = num.nextInt();

		if(max<arr[i])
			max=arr[i];
	}
	System.out.println("max:"+max);*/
 int[] intArray= new int[5];
 //최대값 담을 변수 선언
 int max=0;
 System.out.println("양수 5개를 입력하세요.");
 for(int i=0; i<intArray.length;i++) {
	 
	intArray[i]= scanner.nextInt();
	 if(intArray[i]>max)
		 max=intArray[i];
	 System.out.println("가장 큰수는"+max+"입니다.");
 }
 
	 
	
}
}
