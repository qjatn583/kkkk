package ja0605;

public class MainStringArrayArgument {
public static void main(String[]args) {
	
	if(args.length!=2) {//args�� ���̰� 2�� �ƴҰ��
	System.out.println("���α׷�����");
	System.out.println("java MainStringArrayArgument num1 num2");
	System.exit(0);//���α׷� ��������
}
String strNum1 = args[0];//args[0]�� String������ strNum1�� �־��ش�
String strNum2 = args[1];//args[1]�� String������ strNum2�� �־��ش�

int num1 = Integer.parseInt(strNum1);//strNum1�� ������ ��ȯ�ؼ� num1�� �־��ش�
int num2 = Integer.parseInt(strNum2);//strNum2�� ������ ��ȯ�ؼ� num2�� �־��ش�
	
int result = num1+num2;//result(���)�� ������ num1��num2�� ���Ѱ��� �־��ش�
System.out.println(num1+"+"+num2+"="+result);//num1+num2���Ѱ��� ȣ��
}
}
