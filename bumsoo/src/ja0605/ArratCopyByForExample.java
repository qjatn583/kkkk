package ja0605;

public class ArratCopyByForExample {
public static void main(String[]args) {
	int[]oldIntArray= {1,2,3};//������ oldIntArray�迭�� 1,2,3���μ���
	int[]newIntArray=new int[5];//������ newIntArray�迭�� 5���� int�� ����
	
	for(int i=0;i<oldIntArray.length;i++) {//i�� 0���� �����ϰ� oldIntArray�� ���̸�ŭ �ݺ�
		newIntArray[i]= oldIntArray[i];//newIntArray[i]�ȿ�oldIntArray[i]����
	}
	
	for(int i=0;i<newIntArray.length;i++) {//i�� 0���� ������ newIntArray�� ���̸�ŭ �ݺ�
		System.out.println(newIntArray[i]+",");//oldIntArray[i]�� ������ newIntArray[i]�� ȣ���ϰ� 0,0ȣ��
	}
}
}
