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
		System.out.println("1.���ݤ�  2.��ݤ� 3.�ܰ��4.����");
		System.out.println("--------------------------");
		System.out.println("����>");
		
		int menuNum=s.nextInt();
		 switch(menuNum) {
		 case 1:
			 System.out.print("���ݾ�>");
			 int deposit = s.nextInt();
			 balance +=deposit;
			 System.out.println("������ �ܾ���"+input+"�Դϴ�.");
		 case 2:
			 System.out.print("��ݾ�>");
			 int withdraw = s.nextInt();
			 balance +=withdraw;
			 if(balance<0) {
			 System.out.println("�ܰ� �����մϴ�.");
			 balance=balance+withdraw;
			 System.out.println("�����ܾ״�"+balance+"�Դϴ�.");
			 
			 break;
			 
		 }
		if(input>balance) {
			System.out.println("������ �ܾ���"+input+"�Դϴ�.");
		}
			else if(input<balance) {
				balance-=input;
				System.out.println(balance+"���� �����մϴ�.");
				System.out.println("������ �ܾ���"+(balance-input)+"�Դϴ�.");
				
			}}}}}
