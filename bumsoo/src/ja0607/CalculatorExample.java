package ja0607;

public class CalculatorExample {
public static void main(String[]args) {
	Calculator myCalc = new Calculator();//CalculatorŬ�������� ������������ mycalc��ü ����
	myCalc.powerOn();//Calculator�� powerOn������ �����´�
	 int result1 = myCalc.plus(5, 6);//result1�� Calculator�� ������ ������ 5+6�� �� ����� �����Ѵ�
	 System.out.println("result1:"+result1);
	 
	 byte x = 10;
	 byte y = 4;
	 double result2=myCalc.divide(x, y);//result2�� Calculator�� ������ ������ x/y�� ��� ����
	 System.out.println("result2:"+result2);
	
	 myCalc.powerOff();//Calculator�� ������ ������ poweOff�� ������ ������
}
}
