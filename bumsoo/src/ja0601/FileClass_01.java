package ja0601;

import java.io.*;

public class FileClass_01 {
public static void main(String[]args) {
	File rfile= new File("D;\\test\\testfile.txt");
	File wfile= new File("D;\\test\\testfile_new.txt");
	try {
		BufferedReader reader = new BufferedReader(new FileReader(rfile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(wfile));
		
		String s;
		//�������Ͽ� �ִ� ������ �о s�� ����
		while((s=reader.readLine())!=null) {
			//s�� ����� ���� �� �߰� ���ڿ��� ���ο� ������ wfile�� ����
			writer.write(s+"-���� ������ ����");
		}
		reader.close();
		writer.close();
		rfile.delete();//�������ϻ���
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("���ξ���Ϸ�");
}
}
