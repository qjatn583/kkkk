package ja0601;

import java.io.*;
import java.util.Scanner;

public class FileClass_02 {

	public static void main(String[]args) {
		//Scanner�� consoleâ�� �Է��� ������ �״�� ���Ͽ� �����ϱ�
		System.out.println("���Ͼ��⿬��");
		System.out.println("������ ���ϸ�:");
		Scanner scan = new Scanner(System.in);
		String filename= scan.next();
		System.out.println("������ ���ؼ��� ������ ���ο� q�� �Է��ϼ���");
		
		try {
			String path="D:\\text\\" +filename;
			BufferedReader reader=
					new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter(path));
			String s;
			while(!(s=reader.readLine()).equals("q")) {
				writer.write(s+"\r\n");
			}
					reader.close();
					writer.close();
					scan.close();
					
		}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("���α׷��� �����մϴ�.");
	System.out.println(filename+"����Ϸ�!");
		
}
}