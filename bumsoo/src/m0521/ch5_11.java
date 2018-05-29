package m0521;

import java.util.Scanner;

public class ch5_11 {
public static void main(String[]args) {
	/*거스름돈 문제
	 * 어떤 금액을 입력하게 되면 각 동전이 몇 개씩 필요한지 출력하는 문제
	 * 가능한 적은 수의 동전으로 거슬러 줄 수 있도록
	 * 예를들어
	 * 2680원이면
	 * 500원:5개
	 * 100원:1개
	 * 50원:1개
	 * 10원3개
	 * */
	Scanner scan=new Scanner(System.in);
	int[]coinUnit = {500,100,50,10};
	
	System.out.println("금액");
	int change=scan.nextInt();
	
	for (int i=0;i<coinUnit.length;i++) {
		int coinCount=change/coinUnit[i];
		System.out.println(coinUnit[i]+"원동전:"+coinCount+"개");
		
		change=change%coinUnit[i];
	}
}
}
