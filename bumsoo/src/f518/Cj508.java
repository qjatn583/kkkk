package f518;

import java.util.Scanner;

public class Cj508 {
public static void main(String[]args) {
	/*
	 * 3��¥�� 1���� �迭�� �����ϰ�
	 * ��ĳ�ʸ� �̿��Ͽ� ���� �ϳ��ϳ� �Է��ϰ�
	 * �Էµ� ���� ���չ� ��հ��� ���Ͻÿ�. 
	 */

	Scanner num = new Scanner(System.in);
	 System.out.println("3��¥�� 1���� �迭 ����");
	 int i=0;
	 int j=0;
	 int k=0;
	int[]scores = {i,j,k};//3��¥�� 1���� �迭 ����
	 System.out.println("scores[0]:"+scores[0]);//1��°
	 System.out.println("scores[1]:"+scores[1]);//2��°
	 System.out.println("scores[2]:"+scores[2]);//3��°
	//------------------------------------------------
	 
	int sum = 0;//�� ����
	 for(int z=0;z<scores.length;z++) //scores.length=�迭�� ����(ĭ)
	 {
		 sum+=scores[z];
		 
		scores[z]=num.nextInt();
		 }
	 System.out.println("����:"+sum);//������ ���
	 double avg=sum/3;//����� ���� ������ 3
	 System.out.println("���:"+avg);//����� ���
}
}
