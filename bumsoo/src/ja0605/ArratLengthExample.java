package ja0605;

public class ArratLengthExample {
public static void main(String[]args) {
	int[]scores= {83,90,97};//������ scores��� �迭�� 83,90,97�� ����
	int sum =0;//������ sum�� 0���� ����
	for(int i=0;i<scores.length;i++) {//for���� �̿��� 0���ͽ����� scores�� ���̸�ŭ �ݺ�
	sum	+=scores[i];//scores[i]�� �հ踦 �˷��ش�
	System.out.println("����:"+sum);//����260�� ȣ��
	double avg=(double)sum/scores.length;//����� �ǹ��ϴº���avg�� ������ȯ�� �̿��� �հ�
	//������ scores�� ���� ��3���� ������.
	System.out.println("���:"+avg);//����� ȣ��
		
	}
}
}
