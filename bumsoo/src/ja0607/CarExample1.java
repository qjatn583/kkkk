package ja0607;

public class CarExample1 {
public static void main(String[]args) {
	Car1 car1 = new Car1();//new�����ڸ� �̿��Ͽ� Car1 class��  ������ ������ car1�� ������
	System.out.println("car1.company:"+car1.company);//Car1class�� ������ ������ car1.company�� ȣ��
	System.out.println();
	
	Car1 car2 = new Car1("�ڰ���");//Car1 class�� ������ ������ car2�� �����ϰ� �ڰ����� ȣ���Ѵ�.
	System.out.println("car2.company:"+car2.company);//Car1 class�� ������ ������ car2.company�� ȣ��
	System.out.println("car2.model:"+car2.model);//Car1 class�� ������ ������ car2.model�� ȣ��
	System.out.println();
	
	Car1 car3 = new Car1("�ڰ���","����");//Car1 class���� ������ ������ car3�� �����ϰ� �ڰ��� ������ ȣ��
	System.out.println("car3.company:"+car3.company);
	System.out.println("car3.model:"+car3.model);
	System.out.println("car3.color:"+car3.color);
	System.out.println();
	Car1 car4 = new Car1("�ڰ���","����",200);
	System.out.println("car4.company:"+car4.company);
	System.out.println("car4.model:"+car4.model);
	System.out.println("car4.color:"+car4.color);
	System.out.println("car4.maxSpeed:"+car4.maxSpeed);
	System.out.println();
	
}
}
