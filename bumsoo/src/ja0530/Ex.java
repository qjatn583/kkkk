package ja0530;

public class Ex {
public static void main(String[]args) {
	//�������� Ƽ�� �Ǵ� �Ϲ� Ƽ���� ���� ��ü�� ���� ������ ���
	AdvancedTicket adticket= new AdvancedTicket(100,20);
	adticket.setPrice(100000);
	
	System.out.println("����� �������� Ƽ�Ϲ�ȣ��"+adticket.getNumber()+"�̰� ���Ű�����"+adticket.getPrice()+"�Դϴ�.");
}
}
