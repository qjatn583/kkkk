package bumsoo;

import java.util.Scanner;

public class whilewqe {
public static void main(String[]args) {
	Scanner scan= new Scanner(System.in);
	int count=0,n=0;
	double sum=0;
	 System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
	 while(true) {
		n = scan.nextInt();
		sum=sum+n;
		if(n==0)
			break;
		count++;
	 }
	 System.out.println("���� ������ "+count+"���̸�");
	 System.out.println("�����"+sum/count+"�Դϴ�");
	 
		
		
		
		
		
	}

}
