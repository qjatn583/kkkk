package ja0605;

public class ArrInArrayExample {
public static void main(String[]args) {
	 int [][] mathScores = new int[2][3];//2��3���� new�����ڸ�  �������迭�� mathScores
	 //�� �����Ѵ�
	 for(int i=0;i<mathScores.length;i++) {//i�� 0���� �����ؼ� mathScores�� ���̸�ŭ �ݺ�
		 for(int k=0;k<mathScores[i].length;k++) {//����for������ k��0���� mathScores�� ���̸�ŭ �ݺ�
			 System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
			 //mathScores[i][k]�� ȣ��
			 System.out.println();
			 int[][]englishScores = new int[2][];//englishScores�� ���߹迭�� 2���� new�����ڸ� �����Ѵ�.
			 englishScores[0]=new int[2];//englishScores[0]�� 2�� ����
			 englishScores[1]=new int[3];//englishScores[1]�� 3�� ����
			 for(int i=0;i<englishScores.length;i++) {//i�� 0���� englishScores�� ���̸�ŭ �ݺ�
				 for(int k=0;k<englishScores[i].length;i++) {//����for������k��englishScores�� ���̸�ŭ �ݺ�
					 System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
					 //englishScores[i][k]ȣ��
				 }
				 
			 }
			 System.out.println();
			 
			 int[][]javaScores= {{95,80},{92,96,80}};//1��1��=95, 1��2��80, 2��1��92, 2��2��96,2��3��80
			 for(int i=0;i<javaScores.length;i++) {//i�� 0���� javaScores ���̸�ŭ �ݺ�
				 for(int k=0;k<javaScores[i].length;k++) {//����for������k��javaScores�� ���̸�ŭ �ݺ�
					 System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
					//javaScores[i][k]ȣ��
					 
				 }
			 }
		 }
		 
	 }
}
}
