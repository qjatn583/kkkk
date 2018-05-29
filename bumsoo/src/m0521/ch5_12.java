package m0521;

public class ch5_12 {
public static void main(String[]args) {
	/*
	 * 2차원 배열을 사용하여 평점 계산하기
	 */
	double score[][]= {{3.3, 3.4},
						{3.5, 3.8},
	                    {4.2, 4.3},
	                    {3.9, 4.0}};
	/*System.out.println("score[0][0]:"+score[0][0]);
	System.out.println("score[1][1]:"+score[1][1]);
	System.out.println("score[2][2]:"+score[2][2]);
	System.out.println("score[3][3]:"+score[3][3]);
	int[] arr1 = new int[4]; 
	 for(int i=0;i<4;i++) {
		System.out.println("arr1["+i+":"+arr1[i]);
	 }*/
	double sum=0;
	int count=0;
	for(int i=0;i<score.length;i++) {
		for(int j=0;j<score[i].length;) {
		sum = sum + score[i][j];
		count++;
		}
	}
	double avg= sum/count;
	System.out.println("전체평균은:"+avg);
	}
}

