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
		//기존파일에 있는 내용을 읽어서 s에 저장
		while((s=reader.readLine())!=null) {
			//s에 저장된 내용 및 추가 문자열을 새로운 파일인 wfile에 저장
			writer.write(s+"-새로 쓰여진 파일");
		}
		reader.close();
		writer.close();
		rfile.delete();//기존파일삭제
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("새로쓰기완료");
}
}
