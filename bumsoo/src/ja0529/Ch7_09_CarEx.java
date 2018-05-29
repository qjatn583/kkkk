package ja0529;

public class Ch7_09_CarEx {

	public static void main(String[] args) {
		//Car클래스에 대한 객체 선언
		//Car클래스 타입 변수car선언
		Car car = new Car();
		//부모클래스 타입의 변수 선언
		Ch7_09_Tire tire=new Ch7_09_Tire("aaa",10);
		//자식클래스 탕비의 변수 선언
		HankookTire hktire = new HankookTire("한국",10);
		tire = hktire;
		hktire = (hankookTire)tire;
		for(int i=1;i<=5;i++) {
			//car.run을problemLocation에 넣어줘서 임무수행
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case1:
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.frontLeftTire = new HankookTire("앞왼쪽",15);
			break;
			case2:
				System.out.println("앞오른쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞오른쪽",13);
				break;
				case3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("뒤왼쪽",14);
					break;
					case1:
						System.out.println("뒤오른쪽 HankookTire로 교체");
						car.frontLeftTire = new HankookTire("뒤오른쪽",17);
						break;
			}
			System.out.println(---------------------);
		}

	}

}
