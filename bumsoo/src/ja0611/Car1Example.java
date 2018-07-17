package ja0611;
//p234
public class Car1Example {
public static void main(String[]args) {
	Car1 myCar = new Car1("포르쉐");//new연산자를 이용해 Car1 클래스의 정보를 가져와 myCar객체안에 포르쉐를 넣어 생성
	Car1 yourCar = new Car1("벤츠");//new연산자를 이용해 Car1클래스의 정보를 가져와 yourCar객체안에 벤츠를 넣어 생성
	myCar.run();//Car1클래스에서 run 메소드 정보를 가져와 myCar에 대입
	yourCar.run();//Car1클래스에서 run 메소드 정보를 가져와 yourCar에 대입
}
}
