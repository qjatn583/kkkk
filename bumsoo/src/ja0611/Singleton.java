package ja0611;

public class Singleton {
private static Singleton singleton = new Singleton();//�ܺο��� ������ ȣ���� ���� ���ϰ� private�� ���༭ Singleton�� 
//������ singleton�� �������ش�
private Singleton() {}//singleton ������ ����
static Singleton getInstance() {//Singleton�ȿ� getInstance�޼ҵ����
	return singleton;//singleton ��� ����
}
}
