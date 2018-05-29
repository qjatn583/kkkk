package f518;

import java.util.Scanner;

public class ch4 {

	public static void main(String[]args) {
		/*
		 * 숫자맞추기게임
		 * 1. 1~100까지 난수발생
		 * 2. 사용자가 숫자를 입력하도록 한다.
		 * 3. 발생된 난수가와 사용자가 입력한 숫자를 비교한다.
		 * 3.1 입력한 숫자가 클경우 숫자가 큽니다. 출력후 횟수1증가
		 * 3.2 입력한 숫자가 작을 경우 숫자가 작습니다. 출력후 횟수1증가
		 * 3.3입력한 숫자가 맞을 경우 맞았습니다. 출력후 횟수 1증가
		 * 3.4시도횟수 출력
		 * 3.5반복문 빠져나옴
		 * */
		int answer =(int)(Math.random()*100)+1;//1~100까지 랜덤
		int input=0;//입력
		int count =0;//시도횟수를 0부터시작
		
		Scanner s=new Scanner(System.in);//입력값 s선언
		
		do {//반복문
			count++;//시도횟수
			System.out.print("1과 100사이의 값을 입력하세요.");//출력
			input = s.nextInt();
			if(answer>input) {//answer가 imput보다 클때
				System.out.println("더 큰수를 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은수를 입력하세요.");
				
			}else {
			System.out.println("맞췄습니다.");//크다거나 작다는게 아니니 정답이다.
			System.out.println("시도횟수는"+count+"번 입니다.");//count가 시도한 횟수니까 몇번 시도했는지 출력해준다. 
			break;//반복문이 끝났으니 break로 닫아준다
			}}while(true);
		
				}}
		
