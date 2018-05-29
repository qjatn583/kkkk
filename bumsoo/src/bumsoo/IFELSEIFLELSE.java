package bumsoo;

import java.util.Scanner;

public class IFELSEIFLELSE {

	public static void main(String[] args) {
		/*
		 * 점수를 스캔으로 입력받아서
		 * 90이상이면 점수가 90~100입니다. 등급은 A입니다.
		 * 80이상 90미만이면 점수가 80~89입니다. 등급은B입니다.
		 * 70이상 80미만이면 점수가 70~79입니다. 등급은c입니다.
		 * 60이상 70미만이면 점수가 60~69입니다.	 등급은D입니다.
		 * 60미만이면 점수가 60미만입니다. 재수강F.	 
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
			System.out.println("60미만");
			System.out.println("F");
		}
		score.close();
			
		}
		
	}

