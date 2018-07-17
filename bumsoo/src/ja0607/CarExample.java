package ja0607;

public class CarExample {
	public static void main(String[]args) {
Car myCar =new Car();//new연산자를 이용해 Car class에서  Car의 정보를 가져와 myCar 객체 선언

System.out.println("제작회사:"+ myCar.company);//Car class에서 company정보를 가져온다
System.out.println("모델명:"+ myCar.model);//Car class에서 model정보를 가져온다
System.out.println("색깔:"+ myCar.color);//Car class에서 color정보를 가져온다
System.out.println("최고속도"+myCar.maxSpeed);//Car class에서  maxSpeed정보를 가져온다
System.out.println("현재속도"+myCar.speed);//Car class에서 speed정보를 가져온다

myCar.speed = 60;//Car class에 있는 speed를 60으로 설정
System.out.println("수정된 속도:"+myCar.speed);
	}
}
