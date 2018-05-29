
public class car3Exampie {

	

	public static void main(String[] args) {
	car3 car= new car3();
	car.setGas(5);
	
	boolean gasState = car.isLeftGas();
	if(gasState) {
		System.out.println("출발합니다");
		car.run();
	}
	if(car.isLeftGas()) {
		System.out.println("gas를 주입할 필요가 있습니다.");
	}else {
		System.out.println("gas를 주입하세요.");
	}
	}

}
