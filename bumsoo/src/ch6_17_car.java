//gatter, setter �޼ҵ� ��� ����
public class ch6_17_car {
	//�ʵ弱��
private int speed;
private boolean stop;
//�޼ҵ弱��
//speed�ʵ忡 ����gatter�޼ҵ� ����
public int getSpeed() {
	return speed;
	
}
//speed�ʵ忡 ����setter�޼ҵ� ����
public void setspeed(int speed) {
	if(speed<0) {
		this.speed=0;
		return;
		
	}else {
		this.speed=speed;
	}
}
//stop�ʵ忡 ����getter�޼ҵ� ����
public boolean isStop() {
	return stop;
}
//stop�ʵ忡 ���� setter�޼ҵ� ����
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

