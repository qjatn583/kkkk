package ja0607;

public class CarExample {
	public static void main(String[]args) {
Car myCar =new Car();//new�����ڸ� �̿��� Car class����  Car�� ������ ������ myCar ��ü ����

System.out.println("����ȸ��:"+ myCar.company);//Car class���� company������ �����´�
System.out.println("�𵨸�:"+ myCar.model);//Car class���� model������ �����´�
System.out.println("����:"+ myCar.color);//Car class���� color������ �����´�
System.out.println("�ְ�ӵ�"+myCar.maxSpeed);//Car class����  maxSpeed������ �����´�
System.out.println("����ӵ�"+myCar.speed);//Car class���� speed������ �����´�

myCar.speed = 60;//Car class�� �ִ� speed�� 60���� ����
System.out.println("������ �ӵ�:"+myCar.speed);
	}
}
