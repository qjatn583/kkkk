package m0521;

import java.util.Scanner;

public class ch_13 {
public static void main(String[]args) {
	String[][] words= {
			{"chair","의자"},
			{"desk","책상"},
			{"water","물"},
			{"monitor","모니터"},
			{"mouse","마우스"}};
	Scanner scan=new Scanner(System.in);
	String inputString;
	System.out.println(words[0][0]+"의 뜻은 무엇인가요.");
	for(int i=0;i<words.length;i++);{
		System.out.println("문제"+(i+1)+"."+words[i][0]+"의 뜻은?");
		String answer=scan.nextLine();
		
		if(answer.equals(words[i][1])) {
			System.out.println("정답입니다.");
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


