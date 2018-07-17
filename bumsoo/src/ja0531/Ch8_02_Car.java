package ja0531;

public class Ch8_02_Car {
	//좌변:Tire인터페이스 타입의변수
Ch8_02_Tire frontLeftTire= new Ch8_02_Hankook();
Ch8_02_Tire frontRightTire= new Ch8_02_Hankook();
Ch8_02_Tire backLeftTire= new Ch8_02_Hankook();
Ch8_02_Tire backRightTire= new Ch8_02_Hankook();

void run() {
	frontLeftTire.roll();
	frontRightTire.roll();
	backLeftTire.roll();
	backRightTire.roll();
}
}
