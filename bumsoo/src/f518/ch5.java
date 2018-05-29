package f518;

import java.util.Scanner;

public class ch5 {
public static void main(String[]args) {

	
	boolean r=true;
	int balance = 0;
	Scanner s = new Scanner(System.in);
	int input=0;
	
	while(r) {
		System.out.println("--------------------------");
		System.out.println("1.예금ㅣ  2.출금ㅣ 3.잔고ㅣ4.종료");
		System.out.println("--------------------------");
		System.out.println("선택>");
		
		int menuNum=s.nextInt();
		 switch(menuNum) {
		 case 1:
			 System.out.print("예금액>");
			 int deposit = s.nextInt();
			 balance +=deposit;
			 System.out.println("현재의 잔액은"+input+"입니다.");
		 case 2:
			 System.out.print("출금액>");
			 int withdraw = s.nextInt();
			 balance +=withdraw;
			 if(balance<0) {
			 System.out.println("잔고가 부족합니다.");
			 balance=balance+withdraw;
			 System.out.println("현재잔액는"+balance+"입니다.");
			 
			 break;
			 
		 }
		if(input>balance) {
			System.out.println("현재의 잔액은"+input+"입니다.");
		}
			else if(input<balance) {
				balance-=input;
				System.out.println(balance+"원이 부족합니다.");
				System.out.println("현재의 잔액은"+(balance-input)+"입니다.");
				
			}}}}}
