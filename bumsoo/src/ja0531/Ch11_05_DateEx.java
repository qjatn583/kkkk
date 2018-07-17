package ja0531;

import java.text.SimpleDateFormat;
import java.util.Date;

//Date클래스 예제
public class Ch11_05_DateEx {
public static void main(String[]args) {
	Date now =new Date();
	String strNow = now.toString();
	System.out.println(now);
	System.out.println(strNow);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일hh시mm분ss초");
	String strNow2 = sdf.format(now);
	System.out.println(strNow2);
}
}
