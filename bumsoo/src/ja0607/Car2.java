package ja0607;

public class Car2 {
//�ʵ弱��
	String company = "�����ڵ���";//company��� ��ü�� �����ϰ� �����ڵ����� �����Ѵ�.
	String model;//model��ü����
	String color;//color��ü����
	int maxSpeed;//maxSpeed��ü����
	//������
	Car2(){
	}
	Car2(String model){
		this(model,"����",250);
	}
	Car2(String model,String color){
		this(model,color,250);
	Car2(String model,String color,int maxSpeed){
		this.model= model;
		this.color= color;
		this.maxSpeed=maxSpeed;
	}
	}
}
