package ja0604;
//��ǰ�� ���Ǹ� ���� �߻�Ŭ���� 
public abstract class Product {
//�ʵ弱��
	String pName;
	int price;
	
	//��ǰ�� ��ü�� ���� ����� ���� �޼ҵ�
	public void printDatail() {
		System.out.println("��ǰ��:"+pName+",");
		System.out.println("����:"+price+",");
		printExtra();
	}
}
