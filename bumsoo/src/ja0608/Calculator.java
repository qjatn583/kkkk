package ja0608;

public class Calculator {
int plus(int x,int y) {//plus�� �޼ҵ带 �������ְ� �Ű����� x,y�� �������ش�
	int result = x+y;//result�� x+y����
	return result;//result�� ���ϰ��� �޴´�
	
	
}
double avg(int x,int y) {//avg�� �޼ҵ带 �������ְ� �Ű�����x,y�� �������ش�
	double sum = plus(x,y);
	double result = sum/2; //result���� sum/2���� �������ش�
	return result;//result�� ���ϰ��� �޴´�
	
}
void execute() {//execute�� �޼ҵ� ����
	double result = avg(7,10);//result���� avg(7,10)���� ����
	println("������:"+result);//��� ȣ��
}
void println(String message) {//���� println���� ȣ���ϰ� message������ �������ش�
	System.out.println(message);
}
}
