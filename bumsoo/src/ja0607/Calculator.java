package ja0607;

public class Calculator {
//�޼ҵ�
	void powerOn() {//powerOn�� ���ϰ��� �����Ƿ� void
		System.out.println("�������մϴ�");
	}
	int plus(int x, int y) {//plus��� �޼ҵ带 �����ϰ� x,y���� �־��ش�
		int result = x+y;//result���� x+y�� �־��ش�
		return result;//plus�� ������� �����Ƿ� �����ִ� result���� return���ش�
		
	}
		double divide(int x,int y) {//divide��� �޼ҵ带 �����ϰ� x,y���� �־��ش�
			double result =(double)x/(double)y;//result���� x,y�� �־��ִµ� x,y�� int ���̶� double�� ��ȯ���ش�
			return result;//divide�� ������� �����Ƿ� result���� return���ش�.
			
	}
	void powerOff() {//powerOff��� �޼ҵ带 �������ش�
		System.out.println("������ ���ϴ�");
	}
}
