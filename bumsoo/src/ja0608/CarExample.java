	package ja0608;

public class CarExample {
public static void main(String[]args) {
	Car myCar =new Car();//new연산자를 이용해 Car클래스에서 정보를 가져와 myCar에 대입을 해준다
	
	myCar.setGas(5);//Car클래스에서  setGas()의 메소드 호출하는데 setGas의 5만큼 호출
	 boolean gasState = myCar.isLeftGas();//gasState에 Car클래스의 isLeftGas메소드를 대입해준다
	 if(gasState) {
		 System.out.println("출발합니다");
	 myCar.run();//Car클래스의 run메소드 호출
	 }
if(myCar.isLeftGas()) {//Car의 클래스에서 isLeftGas의 메소드 호출
	System.out.println("gas를 주입할필요가 없습니다");
}else {
	System.out.println("gas를 주입해 주세요");
}
}
}
