package ja0605;

public class AdvancedForExample {
public static void main (String[]args) {
	int[]scores= {95,71,84,93,87};//�迭�� scores�� 95,71,84,93,87�Է�
	int sum = 0;
	for(int score:scores) {//score�� scores�� �������ְ�
		sum = sum+score;//scores�� ���ִ� score�� sum�� ���ؼ� sum�� �־��ش�
		
	}
	System.out.println("���� ����="+sum);//���������� ȣ��
	double avg = (double)sum/scores.length;//����� �ǹ��ϴ� �Ǽ��� ���� avg���ٰ� (double)�� �̿��� 
	//�Ǽ��� ��ȯ��Ų sum��scores.length(5)�� �������� �����Ѵ�
	System.out.println("�������="+avg);//������� ȣ��
}
}
