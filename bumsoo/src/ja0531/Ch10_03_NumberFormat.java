package ja0531;

public class Ch10_03_NumberFormat {
public static void main(String[]args) {
	//NumberFormatException
	//문자열을 숫자로 변환할때 발생하는 예외
	String data1="100";
	String data2="a100";
	//문자열을 숫자로 변환
	int value1 = Integer.parseInt(data1);
	int value2 = Integer.parseInt(data2);
	
	int result=  value1+value2;
	System.out.println(data1+"+"+data2+"="+result);
			
			
}
}
