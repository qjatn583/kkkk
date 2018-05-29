package f518;

import java.util.Scanner;

public class Cj508 {
public static void main(String[]args) {
	/*
	 * 3열짜리 1차원 배열을 선언하고
	 * 스캐너를 이용하여 값을 하나하나 입력하고
	 * 입력된 값의 총합및 평균값을 구하시오. 
	 */

	Scanner num = new Scanner(System.in);
	 System.out.println("3열짜리 1차원 배열 선언");
	 int i=0;
	 int j=0;
	 int k=0;
	int[]scores = {i,j,k};//3열짜리 1차원 배열 선언
	 System.out.println("scores[0]:"+scores[0]);//1번째
	 System.out.println("scores[1]:"+scores[1]);//2번째
	 System.out.println("scores[2]:"+scores[2]);//3번째
	//------------------------------------------------
	 
	int sum = 0;//합 선언
	 for(int z=0;z<scores.length;z++) //scores.length=배열의 길이(칸)
	 {
		 sum+=scores[z];
		 
		scores[z]=num.nextInt();
		 }
	 System.out.println("총합:"+sum);//총합을 출력
	 double avg=sum/3;//평균은 총합 나누기 3
	 System.out.println("평균:"+avg);//평균을 출력
}
}
