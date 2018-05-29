package bumsoo;

public class ch4_16_Break {
public static void main(String[]args) {
	while(true) {
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		if(num==6) {
			break;
		}
	}
	System.out.println("반복문 종료됨");
}
}
