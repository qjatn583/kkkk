	package ja0608;

public class CarExample {
public static void main(String[]args) {
	Car myCar =new Car();//new�����ڸ� �̿��� CarŬ�������� ������ ������ myCar�� ������ ���ش�
	
	myCar.setGas(5);//CarŬ��������  setGas()�� �޼ҵ� ȣ���ϴµ� setGas�� 5��ŭ ȣ��
	 boolean gasState = myCar.isLeftGas();//gasState�� CarŬ������ isLeftGas�޼ҵ带 �������ش�
	 if(gasState) {
		 System.out.println("����մϴ�");
	 myCar.run();//CarŬ������ run�޼ҵ� ȣ��
	 }
if(myCar.isLeftGas()) {//Car�� Ŭ�������� isLeftGas�� �޼ҵ� ȣ��
	System.out.println("gas�� �������ʿ䰡 �����ϴ�");
}else {
	System.out.println("gas�� ������ �ּ���");
}
}
}
