package ja0529;

public class Ch7_09_CarEx {

	public static void main(String[] args) {
		//CarŬ������ ���� ��ü ����
		//CarŬ���� Ÿ�� ����car����
		Car car = new Car();
		//�θ�Ŭ���� Ÿ���� ���� ����
		Ch7_09_Tire tire=new Ch7_09_Tire("aaa",10);
		//�ڽ�Ŭ���� ������ ���� ����
		HankookTire hktire = new HankookTire("�ѱ�",10);
		tire = hktire;
		hktire = (hankookTire)tire;
		for(int i=1;i<=5;i++) {
			//car.run��problemLocation�� �־��༭ �ӹ�����
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case1:
			System.out.println("�տ��� HankookTire�� ��ü");
			car.frontLeftTire = new HankookTire("�տ���",15);
			break;
			case2:
				System.out.println("�տ����� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ�����",13);
				break;
				case3:
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�ڿ���",14);
					break;
					case1:
						System.out.println("�ڿ����� HankookTire�� ��ü");
						car.frontLeftTire = new HankookTire("�ڿ�����",17);
						break;
			}
			System.out.println(---------------------);
		}

	}

}
