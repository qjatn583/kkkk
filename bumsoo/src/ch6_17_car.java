//gatter, setter 메소드 사용 예제
public class ch6_17_car {
	//필드선언
private int speed;
private boolean stop;
//메소드선언
//speed필드에 대한gatter메소드 선언
public int getSpeed() {
	return speed;
	
}
//speed필드에 대한setter메소드 선언
public void setspeed(int speed) {
	if(speed<0) {
		this.speed=0;
		return;
		
	}else {
		this.speed=speed;
	}
}
//stop필드에 대한getter메소드 선언
public boolean isStop() {
	return stop;
}
//stop필드에 대한 setter메소드 선언
public void setStop(boolean stop) {
	this.stop=stop;
	this.speed=0;
}
/*public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public boolean isStop() {
	return stop;
}
public void setStop(boolean stop) {
	this.stop = stop;
}*/
}

