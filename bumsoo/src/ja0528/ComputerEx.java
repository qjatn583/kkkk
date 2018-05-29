package ja0528;

public class ComputerEx {
public static void main(String[]args) {
	Calculator calculator = new Calculator();
	System.out.println("부모클래스 메소드 호출:"+calculator.areaCircle(r));
	
	Computer computer = new Computer();
	System.out.println("자식클래스 메소드 호출:"+computer.areaCircle(r));
}
}
