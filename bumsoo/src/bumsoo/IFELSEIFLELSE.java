package bumsoo;

import java.util.Scanner;

public class IFELSEIFLELSE {

	public static void main(String[] args) {
		/*
		 * ������ ��ĵ���� �Է¹޾Ƽ�
		 * 90�̻��̸� ������ 90~100�Դϴ�. ����� A�Դϴ�.
		 * 80�̻� 90�̸��̸� ������ 80~89�Դϴ�. �����B�Դϴ�.
		 * 70�̻� 80�̸��̸� ������ 70~79�Դϴ�. �����c�Դϴ�.
		 * 60�̻� 70�̸��̸� ������ 60~69�Դϴ�.	 �����D�Դϴ�.
		 * 60�̸��̸� ������ 60�̸��Դϴ�. �����F.	 
		 * 
		 */
		Scanner score = new Scanner (System.in);
		int Score =score .nextInt();
		if(Score>=90) {
			System.out.println("90~100");
			System.out.println("A");
		}
		else if(Score>=80) {
			System.out.println("80~89");
			System.out.println("B");}
		else if(Score>=70) {
			System.out.println("70~79");
			System.out.println("C");
		}
		else if(Score>=60) {
			System.out.println("60~69");
			System.out.println("D"); }
		else{
			System.out.println("60�̸�");
			System.out.println("F");
		}
		score.close();
			
		}
		
	}

