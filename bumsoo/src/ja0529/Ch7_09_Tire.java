package ja0529;
//�ʵ��� ������ ����
public class Ch7_09_Tire {//Ÿ�̾�Ŭ����
	
	//�ʵ弱��
public int maxRotation;//�ִ� ȸ����
public int accumulatedRotation;//���� ȸ����
public String location;//Ÿ�̾��� ��ġ
//������
public Ch7_09_Tire(String location,int maxRotation) {
	this.location=location;//location�� �ʱ�ȭ
	this.maxRotation=maxRotation;//maxRotation�� �ʱ�ȭ
//�޼ҵ�	
	//Tire frontLeftTire = new Tire("�տ���",6);
	//Tire frontRightTire = new Tire("�տ�����",2);
	//Tire backLeftTire = new Tire("�ڿ���",3);
	//Tire backRigftTire = new Tire("�ڿ�����",4);
public boolean roll() {
	//accumulatedRotation�� �ʱⰪ�� 0
	++accumulatedRotation;//���� ȸ���� 1����
	//accumulatedRotation�� 1�̰�maxRotation6�̴�.
	//accumulatedRotation�� 1�̰�maxRotation2�̴�.
	if(accumulatedRotation<maxRotation) {//�ִ� ȸ������ ����ȸ�������� Ŭ���
		System.out.println(location+"Tire ����:"+//Ÿ�̾��� ��ġ+Ÿ�̾��� ����
				(maxRotation-accumulatedRotation)+"ȸ");//�ִ�ȸ����-����ȸ����=ȸ
		
		return true;
	}else{
		System.out.println("***"+location+"Tire��ũ***");//�ִ� ȸ������ �ʰ��� Ÿ�̾� ��ġ�� ��ũ�� ����
		return false;
	}
}
}
}
