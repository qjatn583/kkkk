package ja0531;

public class Ch10_03_NumberFormat {
public static void main(String[]args) {
	//NumberFormatException
	//���ڿ��� ���ڷ� ��ȯ�Ҷ� �߻��ϴ� ����
	String data1="100";
	String data2="a100";
	//���ڿ��� ���ڷ� ��ȯ
	int value1 = Integer.parseInt(data1);
	int value2 = Integer.parseInt(data2);
	
	int result=  value1+value2;
	System.out.println(data1+"+"+data2+"="+result);
			
			
}
}
