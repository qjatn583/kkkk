package bumsoo;

import java.util.Scanner;

public class text {


	public static void main(String[]args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력:");
		int Score = scan.nextInt();
		
		System.out.println("학년입력.");
		if (Score>=60) {
			if(year !=4)
			System.out.println("합격");
			else if (score>=70)
				System.out.println("합격");
			else 
				System.out.println("불합격");
		}
		else 
			System.out.println("불합격");
		
			}
			
		}
		
	}

