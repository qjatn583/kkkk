package ja0607;

public class Car1 {
String company = "�����ڵ���";//company��� ������ �����ڵ����� ����
String model;//model�̶�� ���� ����
String color;//color�̶�� ���� ����
int maxSpeed;//maxSpeed��� ���� ����

//������
Car1(){
	
}
Car1(String model){
	this.model = model;//�Ű�����model����
}
Car1(String model,String color){//�ʵ� Car1���� model,color�� ������ �����´�
	this.model =model;//�Ű����� model����
	this.color=color;//�Ű�����color����
}
Car1(String model,String color,int maxSpeed){//�ʵ� Car1���� model,color,maxSpeed�� ������ �����´�
	this.model =model;
	this.color=color;
	this.maxSpeed=maxSpeed;
}
}
