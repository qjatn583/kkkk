package f518;

import java.util.Scanner;

public class ch4 {

	public static void main(String[]args) {
		/*
		 * ���ڸ��߱����
		 * 1. 1~100���� �����߻�
		 * 2. ����ڰ� ���ڸ� �Է��ϵ��� �Ѵ�.
		 * 3. �߻��� �������� ����ڰ� �Է��� ���ڸ� ���Ѵ�.
		 * 3.1 �Է��� ���ڰ� Ŭ��� ���ڰ� Ů�ϴ�. ����� Ƚ��1����
		 * 3.2 �Է��� ���ڰ� ���� ��� ���ڰ� �۽��ϴ�. ����� Ƚ��1����
		 * 3.3�Է��� ���ڰ� ���� ��� �¾ҽ��ϴ�. ����� Ƚ�� 1����
		 * 3.4�õ�Ƚ�� ���
		 * 3.5�ݺ��� ��������
		 * */
		int answer =(int)(Math.random()*100)+1;//1~100���� ����
		int input=0;//�Է�
		int count =0;//�õ�Ƚ���� 0���ͽ���
		
		Scanner s=new Scanner(System.in);//�Է°� s����
		
		do {//�ݺ���
			count++;//�õ�Ƚ��
			System.out.print("1�� 100������ ���� �Է��ϼ���.");//���
			input = s.nextInt();
			if(answer>input) {//answer�� imput���� Ŭ��
				System.out.println("�� ū���� �Է��ϼ���.");
			}else if(answer<input) {
				System.out.println("�� �������� �Է��ϼ���.");
				
			}else {
			System.out.println("������ϴ�.");//ũ�ٰų� �۴ٴ°� �ƴϴ� �����̴�.
			System.out.println("�õ�Ƚ����"+count+"�� �Դϴ�.");//count�� �õ��� Ƚ���ϱ� ��� �õ��ߴ��� ������ش�. 
			break;//�ݺ����� �������� break�� �ݾ��ش�
			}}while(true);
		
				}}
		
