package ja0528;

public class SupersonicAirplane {
//1�� ���� ���� NORMAL �������
	//2�� ���� ����SUPERSONIC�������
public static final int NORMAL=1;
public static final int SUPERSONIC=2;

public int flyMode = NORMAL;

//fiy�޼ҵ� ������
//@override
public void fly() {
	if(flyMode==SUPERSONIC) {
		System.out.println("�����Ӻ����մϴ�.");
	}else {
		super.fly();
	}
}
}
