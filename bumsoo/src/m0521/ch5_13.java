package m0521;

public class ch5_13 {
public static void main(String[]args) {
	/*���� for��(for-each)*/
	int[]scores= {95,85,90,68,88};
	int sum=0;
	//for-each��
	//score�� �ݺ��� ���� ����
	for(int score:scores) {
		sum= sum+score;
		System.out.println(score);
	}
	System.out.println("���� ����:"+sum);
	}
}
