
public class car3Exampie {

	

	public static void main(String[] args) {
	car3 car= new car3();
	car.setGas(5);
	
	boolean gasState = car.isLeftGas();
	if(gasState) {
		System.out.println("����մϴ�");
		car.run();
	}
	if(car.isLeftGas()) {
		System.out.println("gas�� ������ �ʿ䰡 �ֽ��ϴ�.");
	}else {
		System.out.println("gas�� �����ϼ���.");
	}
	}

}
