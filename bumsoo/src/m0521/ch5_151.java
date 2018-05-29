package m0521;

import java.io.InputStream;
import java.util.Scanner;

public class ch5_151 {
public static void main(String[]args) {
	boolean run = true;
	int studentNum = 0;//학생수를 받아 처리하기 위한 변수
	int[]scores=null;//배열
	Scanner scan =new Scanner(System.in);
	
	
	
	while(run) {
		System.out.println("--------------------------------------");
		System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
		System.out.println("--------------------------------------");
		System.out.println("선택>");
		
		int i= scan.nextInt();
		
		if(i==1) {//학생수를 입력받아 입력받은 값 만큼의 배열 크기로 설정
			System.out.println("학생수>");
			studentNum=scan.nextInt();//학생수를 입력해주는걸 선언
			scores=new int[studentNum];//학생수만큼 점수입력
		}
		
		else if(i==2) {//입력된 학생수 만큼의 점수를 입력하여 배열에 저장
			for(int j=0;j<scores.length;j++) {
			System.out.println(j+1+"번째 학생 점수:");
			scores[j]=scan.nextInt();//점수 j를 입력해주 배열을 선언
			
			}}
			else if(i==3) {//배열에 입력된 값을 하나하나 출력
				for(int j=0;j<scores.length;i++) {
					System.out.println((j+1)+"번째 학생 점수"+scores[j]);}}
			else if(i==4) {//배열에 입력된 값중 최고값과 평균값을 계산하여 출력
			int max=0,sum=0;
			double avg=0;
			for(int j=0;j<scores.length;i++) {
				max=(max<scores[i])?scores[i]:max;
				sum+=scores[i];}
			avg = (double)sum/scores.length;
			System.out.println("최고점수:"+max);
			System.out.println("평균점수:"+avg);}
			else if(i==5) {//반복문 종료
			
				run = false;}}}
}
	


