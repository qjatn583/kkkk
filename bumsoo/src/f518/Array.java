package f518;

public class Array {
public static void main(String[]args) {
	//�迭 ���� :int Ÿ���� scores��� �迭 ���� ����
	//int[]scores;
	int[] scores= {83,90,97};
	
	//�迭������(���)
	System.out.println("scores[0]�� �� :"+scores[0]);
	System.out.println("scores[1]�� �� :"+scores[1]);
	System.out.println("scores[1]�� �� :"+scores[2]);
	//�迭����
	int length=scores.length;
	System.out.println("�迭���� length ������:"+ length);
	
	//�迭 ��ҵ��� �� ���ϱ�
	int sum=0;
	for(int i=0;i<=2;i++) {
		
		sum=sum+scores[0];
		sum=sum+scores[1];
		sum=sum+scores[2];
		
		sum=sum+scores[i];
	}
	System.out.println("����:"+sum);
	double avg = sum/scores.length;
	System.out.println("���:"+avg);
}
}
