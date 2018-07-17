package ja0607;

public class CarExample1 {
public static void main(String[]args) {
	Car1 car1 = new Car1();//new연산자를 이용하여 Car1 class의  내용을 가져와 car1을 생성함
	System.out.println("car1.company:"+car1.company);//Car1class의 정보를 가져와 car1.company을 호출
	System.out.println();
	
	Car1 car2 = new Car1("자가용");//Car1 class의 내용을 가져와 car2을 생성하고 자가용을 호출한다.
	System.out.println("car2.company:"+car2.company);//Car1 class의 정보를 가져와 car2.company를 호출
	System.out.println("car2.model:"+car2.model);//Car1 class의 정보를 가져와 car2.model을 호출
	System.out.println();
	
	Car1 car3 = new Car1("자가용","빨강");//Car1 class에서 내용을 가져와 car3를 생성하고 자가용 빨강을 호출
	System.out.println("car3.company:"+car3.company);
	System.out.println("car3.model:"+car3.model);
	System.out.println("car3.color:"+car3.color);
	System.out.println();
	Car1 car4 = new Car1("자가용","검정",200);
	System.out.println("car4.company:"+car4.company);
	System.out.println("car4.model:"+car4.model);
	System.out.println("car4.color:"+car4.color);
	System.out.println("car4.maxSpeed:"+car4.maxSpeed);
	System.out.println();
	
}
}
