package ja0611;

public class SingletonExample {
public static void main(String[]args) {
	Singleton obj1 = Singleton.getInstance();//Singleton Ŭ������ �ִ� getInstance������ obj1�� ����
	Singleton obj2 = Singleton.getInstance();//Singleton Ŭ������ �ִ� getInstance������ obj2�� ����
	
	if(obj1==obj2) {//obj1�� obj2�� ���ٸ�
		System.out.println("���� Singleton��ü�Դϴ�");
	}else {
		System.out.println("�ٸ� Singleton��ü�Դϴ�");	
		}
	
}
}
	