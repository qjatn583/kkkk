package ja0531;

public class Ch8_02_Car {
	//�º�:Tire�������̽� Ÿ���Ǻ���
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
