package ja0529;

public class Ch7_09_Car {
	//�ʵ弱��
//�� �ʵ�� TireŬ���� Ÿ������ �����.(��ü)
	Ch7_09_Tire frontLeftTire = new Ch7_09_Tire("�տ���",6);
	Ch7_09_Tire frontRightTire = new Ch7_09_Tire("�տ�����",2);
	Ch7_09_Tire backLeftTire = new Ch7_09_Tire("�ڿ���",3);
	Ch7_09_Tire backRigftTire = new Ch7_09_Tire("�ڿ�����",4);
//���� ������ �迭��
//TireŬ���� Ÿ���� �迭 ������ �����ؼ� �캯�� �ִ� ������ ���� �迭������ ����
	Ch7_09_Tire[]tire = new Ch7_09_Tire[100];
	Ch7_09_Tire[]tire1 = {};
	Ch7_09_Tire[]tire2= {
			new Ch7_09_Tire("�տ���", 6),
					 new Ch7_09_Tire("�տ�����", 2),
					 new Ch7_09_Tire("�ڿ���", 3),
					 new Ch7_09_Tire("�ڿ�����", 4),
	};
	/*tire2[0]= new Ch7_09_Tire("�տ���",6);
	tire2[1]= new Ch7_09_Tire("�տ���",6);
	tire2[2]= new Ch7_09_Tire("�տ���",6);
	tire2[3]= new Ch7_09_Tire("�տ���",6);*/



//������(X)
//�޼ҵ�
int run() {
	System.out.println("[�ڵ����� �޸��ϴ�.]");
	if(frontLeftTire.roll()==false) {stop();return1;}
	if(frontRightTire.roll()==false) {stop();return2;}
	if(backLeftTire.roll()==false) {stop();return3;}
	if(backRigftTire.roll()==false) {stop();return4;}
	return 0;
}
void stop() {
	System.out.println("[�ڵ����� ����ϴ�.]");
}
}
