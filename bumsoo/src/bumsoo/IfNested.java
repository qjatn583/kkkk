package bumsoo;

import java.util.Scanner;

public class IfNested {

	public static void main(String[] args) {
		/*
		 *������ �Է� �ް�
		 *90���̻��� ������ ���� 95���̻��̸� A+
		 *90���̻� 95���̸��̸� A
		 *85~89 B+
		 *80~84 B
		 *75~79 C+
		 *70~74 C
		 *65~69 D+
		 *60~64 D
		 *60�̸� F
		 *if���� ������ ������ ����ϴ� print�� ���
		 *������ ���� ���� ���� ó���ϴ� String Ÿ���� ������ �ϳ� ���
		 */
		Scanner score = new Scanner(System.in);
		int Score = score.nextInt();
		
		if(Score>=90) {
			if(Score>=95) {
				System.out.println("A+");
			}
			else {
					System.out.println("A");
				}
			}
		if(Score>=80) {
			if(Score>85) {
				System.out.println("B+");
			}
			else {
					System.out.println("B");
				}
			}
		if(Score>=70) {
			if(Score>=75) {
				System.out.println("C+");
			}
			else {
					System.out.println("C");
					if(Score>=60) {
						if(Score>=65) {
							System.out.println("D+");
						}
						else {
								System.out.println("D");
							}
						}
					else {
						System.out.println("F");
					}
				}
			}	
	}
		
		
		
	}

