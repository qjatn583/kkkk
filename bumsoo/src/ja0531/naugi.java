package ja0531;

import java.util.Scanner;

public class naugi {
public static void main(String[]args) {
while(true){
	Scanner scan = new Scanner(System.in);
	System.out.println("분자입력");
	int num1=scan.nextInt();
	System.out.println("분모입력");
	int num2 =scan.nextInt();
	
	int result = num1/num2;
	System.out.println(result);
}

}
}	