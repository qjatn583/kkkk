package m0521;

import java.io.InputStream;
import java.util.Scanner;

public class ch5_151 {
public static void main(String[]args) {
	boolean run = true;
	int studentNum = 0;//�л����� �޾� ó���ϱ� ���� ����
	int[]scores=null;//�迭
	Scanner scan =new Scanner(System.in);
	
	
	
	while(run) {
		System.out.println("--------------------------------------");
		System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
		System.out.println("--------------------------------------");
		System.out.println("����>");
		
		int i= scan.nextInt();
		
		if(i==1) {//�л����� �Է¹޾� �Է¹��� �� ��ŭ�� �迭 ũ��� ����
			System.out.println("�л���>");
			studentNum=scan.nextInt();//�л����� �Է����ִ°� ����
			scores=new int[studentNum];//�л�����ŭ �����Է�
		}
		
		else if(i==2) {//�Էµ� �л��� ��ŭ�� ������ �Է��Ͽ� �迭�� ����
			for(int j=0;j<scores.length;j++) {
			System.out.println(j+1+"��° �л� ����:");
			scores[j]=scan.nextInt();//���� j�� �Է����� �迭�� ����
			
			}}
			else if(i==3) {//�迭�� �Էµ� ���� �ϳ��ϳ� ���
				for(int j=0;j<scores.length;i++) {
					System.out.println((j+1)+"��° �л� ����"+scores[j]);}}
			else if(i==4) {//�迭�� �Էµ� ���� �ְ��� ��հ��� ����Ͽ� ���
			int max=0,sum=0;
			double avg=0;
			for(int j=0;j<scores.length;i++) {
				max=(max<scores[i])?scores[i]:max;
				sum+=scores[i];}
			avg = (double)sum/scores.length;
			System.out.println("�ְ�����:"+max);
			System.out.println("�������:"+avg);}
			else if(i==5) {//�ݺ��� ����
			
				run = false;}}}
}
	


