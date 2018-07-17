package ja0531;

public class Ch11_02_StringEquals {
public static void main(String[]args) {
	String str1 = new String("이름");
	String str2= "이름";
	
	if(str1==str2) {
		System.out.println("같은String객체를 참조");
	}else {
		System.out.println("다른String객체를 참조");
	}if(str1.equals(str2)) {
		System.out.println("같은 문자열을 가짐");
		
	}else {
		System.out.println("다른 문자열을가짐");
	}
}
}
