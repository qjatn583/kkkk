
public class CalculatorExample {
public static void main(String[]args) {
	/*Calculator��ü����
	 * powerOn�޼ҵ� ȣ��
	 * plus�޼ҵ� ȣ��(�Ű� ���� �˾Ƽ�)�� ȣ�� ��� ���
	 * divide�޼ҵ� ȣ��(�Ű����� �˾Ƽ�)�� ȣ�� ��� ���
	 * powerOff�޼ҵ� ���*/
	Calculator s1= new Calculator();
	s1.PowerOn();
	int result = s1.plus(10, 20);
	System.out.println(result);
	 
	 double result1 = s1.divide(10,20);
	 System.out.println(result1);
	 
	 s1.PowerOff();
	 
 }
 
 }

