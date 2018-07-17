package ja0605;

public class ArrInArrayExample {
public static void main(String[]args) {
	 int [][] mathScores = new int[2][3];//2행3열인 new연산자를  이차원배열인 mathScores
	 //에 대입한다
	 for(int i=0;i<mathScores.length;i++) {//i는 0부터 시작해서 mathScores의 길이만큼 반복
		 for(int k=0;k<mathScores[i].length;k++) {//이중for문으로 k는0부터 mathScores의 길이만큼 반복
			 System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
			 //mathScores[i][k]를 호출
			 System.out.println();
			 int[][]englishScores = new int[2][];//englishScores인 이중배열에 2행인 new연산자를 대입한다.
			 englishScores[0]=new int[2];//englishScores[0]에 2행 대입
			 englishScores[1]=new int[3];//englishScores[1]에 3열 대입
			 for(int i=0;i<englishScores.length;i++) {//i를 0부터 englishScores의 길이만큼 반복
				 for(int k=0;k<englishScores[i].length;i++) {//이중for문으로k는englishScores의 길이만큼 반복
					 System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
					 //englishScores[i][k]호출
				 }
				 
			 }
			 System.out.println();
			 
			 int[][]javaScores= {{95,80},{92,96,80}};//1행1열=95, 1행2열80, 2행1열92, 2행2열96,2행3열80
			 for(int i=0;i<javaScores.length;i++) {//i를 0부터 javaScores 길이만큼 반복
				 for(int k=0;k<javaScores[i].length;k++) {//이중for문으로k는javaScores의 길이만큼 반복
					 System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
					//javaScores[i][k]호출
					 
				 }
			 }
		 }
		 
	 }
}
}
