package ja0531;

import java.text.SimpleDateFormat;
import java.util.Date;

//DateŬ���� ����
public class Ch11_05_DateEx {
public static void main(String[]args) {
	Date now =new Date();
	String strNow = now.toString();
	System.out.println(now);
	System.out.println(strNow);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��hh��mm��ss��");
	String strNow2 = sdf.format(now);
	System.out.println(strNow2);
}
}
