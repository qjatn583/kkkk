
public class car2 {
	//�ʵ弱��
	String company="�����ڵ���";
	String model;
	String color;
	String maxSpeed;
	/*	
 * ���������� ������ �����ϱ�
 * 1.�⺻������
 * 2.model�� �Ű������� �ϴ� ������
 * 3.model,color�� �Ű������� �ϴ� ������
 * 4.model,color,maxSpeed�� �Ű������� �ϴ� ������
 */
	car2(){}
	car2(String model){
		/*model = m;*/
		this(model,"����","300");
	}
	car2(String model,String color){
		this.model = model;this.color = color;
	}
	car2(String model,String color,String maxSpeed){
		this.model = model;this.color = color;this.maxSpeed =maxSpeed;
	}
}
