package ja0608;

public class Car {
	
int gas;//gas��� ���� ����

void setGas(int gas) {//setGas�ȿ� int gas�� �������ִ� �޼ҵ�
	this.gas = gas;//Ŭ������ gasȣ��
}
boolean isLeftGas() {//isLeftGas�� true,false�� �������ش�
	if(gas==0) {//gas�� 0�ϰ��
		System.out.println("gas�� �����ϴ�.");
		return false;//����� false = false�� ����
		
	}
System.out.println("gas�� �ֽ��ϴ�.");
return true;//true�� ����
}

void run() {//���ϰ��� ���� run�޼ҵ�
	while(true) {
		if(gas>0) {
		System.out.println("�޸��ϴ�.(gas�ܷ�:"+gas+")");
		gas-=1;//gas�� 1�� ���ҵȴ�.
	}else {
		System.out.println("����ϴ�.(gas�ܷ�:"+gas+")");
		return;//�޼ҵ� ���� ����
	}
}
}
}