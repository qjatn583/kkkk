package ja0601;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {
public static void main(String[]args) {
	//����(�ؽ�Ʈ����)�� �����ϰ� ������ ����
	//�����η� ����ϱ� ���� ���� ����
	String path= "D:\\text\\testfile.txt";
	//���� ��ü ����
	File file= new File(path);
	try {
		FileWriter fw = new FileWriter(file);
		for(int i='A';i<='Z';i++) {
			fw.write(i);
		}
		fw.close();
		System.out.println("���� �Ϸ�");
		
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
