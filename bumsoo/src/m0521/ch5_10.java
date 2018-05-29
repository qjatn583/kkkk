package m0521;

import java.util.Scanner;

public class ch5_10 {
public static void main(String[]args) {
	/*정수 5개를 입력받아 내림차순으로 정렬*/
	/*Scanner scan= new Scanner(System.in);
	int[] intArray= new int[5];
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	
	
	 System.out.println("양수 5개를 입력하세요.");
	 for(int i=0; i<intArray.length;i++) {
		 intArray[i]= scan.nextInt();
		 if(a>b) 
			 a=b;
		 else if(b>c)
			 b=c;
		 else if(c>d)
			 c=d;
		 else if(d>e)
			 d=e;
		 else {
			 
		 }
}System.out.println("내림차순:"+a+b+c+d+e);*/
	Scanner scan=new Scanner(System.in);
	int[]num=new int[5];
	int temp;
	System.out.println("정수5개입력:");
	for(int i=0;i<num.length;i++) {
		num[i]=scan.nextInt();
	}
	for(int j=0;j<num.length;j++) {
		for(int k=j+1;k<num.length;k++) {
			if(num[j]<num[k]) {
				temp=num[j];
				num[j]=num[k];
				num[k]=temp;
				
			}
			
		}
	}
	for(int n=0;n<num.length;n++)
		System.out.println(num[n]);
}}