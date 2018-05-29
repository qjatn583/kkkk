package bumsoo;

import java.util.Scanner;

public class Fore {


public static void main(String[]args) {
	//출력형태 1+2+3+4+5+6+7+8+9+10=55
	Scanner scan= new Scanner(System.in);
	System.out.println("시작:");
	int i = scan.nextInt();
	System.out.println("끝");
	int j, sum=0;
	for(;i<=j;i++) {
		sum +=i;
		System.out.print(i);
  if(i<j)
	  System.out.print("+");
  else {
			System.out.print("=");
			System.out.print(sum);
			
		}
		}
}
}