package m0521;

import java.util.Scanner;

public class ch5_11 {
public static void main(String[]args) {
	/*�Ž����� ����
	 * � �ݾ��� �Է��ϰ� �Ǹ� �� ������ �� ���� �ʿ����� ����ϴ� ����
	 * ������ ���� ���� �������� �Ž��� �� �� �ֵ���
	 * �������
	 * 2680���̸�
	 * 500��:5��
	 * 100��:1��
	 * 50��:1��
	 * 10��3��
	 * */
	Scanner scan=new Scanner(System.in);
	int[]coinUnit = {500,100,50,10};
	
	System.out.println("�ݾ�");
	int change=scan.nextInt();
	
	for (int i=0;i<coinUnit.length;i++) {
		int coinCount=change/coinUnit[i];
		System.out.println(coinUnit[i]+"������:"+coinCount+"��");
		
		change=change%coinUnit[i];
	}
}
}
