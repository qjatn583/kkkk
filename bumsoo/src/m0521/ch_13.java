package m0521;

import java.util.Scanner;

public class ch_13 {
public static void main(String[]args) {
	String[][] words= {
			{"chair","����"},
			{"desk","å��"},
			{"water","��"},
			{"monitor","�����"},
			{"mouse","���콺"}};
	Scanner scan=new Scanner(System.in);
	String inputString;
	System.out.println(words[0][0]+"�� ���� �����ΰ���.");
	for(int i=0;i<words.length;i++);{
		System.out.println("����"+(i+1)+"."+words[i][0]+"�� ����?");
		String answer=scan.nextLine();
		
		if(answer.equals(words[i][1])) {
			System.out.println("�����Դϴ�.");
			score++;
		}
		
		/*inputString =scan.nextLine();
		System.out.println(inputString);
	}
    System.out.println(words[0][1]);
	int i =0;
	int score = 0;
	int count = 0;
	double sum = 0;
for(;i<words.length;i++);*/
	}}}


