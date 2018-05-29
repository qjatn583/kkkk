package bumsoo;

import java.util.Scanner;

public class IfNested {

	public static void main(String[] args) {
		/*
		 *점수를 입력 받고
		 *90점이상인 점수에 대해 95점이상이면 A+
		 *90점이상 95점미만이면 A
		 *85~89 B+
		 *80~84 B
		 *75~79 C+
		 *70~74 C
		 *65~69 D+
		 *60~64 D
		 *60미만 F
		 *if문이 끝나면 학점을 출력하는 print문 사용
		 *주의할 점은 학점 값을 처리하는 String 타입의 변수를 하나 사용
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

