package ja0531;

import java.util.Scanner;

public class naugi {
public static void main(String[]args) {
while(true){
	Scanner scan = new Scanner(System.in);
	System.out.println("�����Է�");
	int num1=scan.nextInt();
	System.out.println("�и��Է�");
	int num2 =scan.nextInt();
	
	int result = num1/num2;
	System.out.println(result);
}

}
}	