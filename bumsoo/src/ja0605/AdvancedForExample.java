package ja0605;

public class AdvancedForExample {
public static void main (String[]args) {
	int[]scores= {95,71,84,93,87};//배열인 scores에 95,71,84,93,87입력
	int sum = 0;
	for(int score:scores) {//score에 scores를 대입해주고
		sum = sum+score;//scores이 들어가있는 score와 sum을 더해서 sum에 넣어준다
		
	}
	System.out.println("점수 총합="+sum);//점수총합을 호출
	double avg = (double)sum/scores.length;//평균을 의미하는 실수형 변수 avg에다가 (double)을 이용해 
	//실수로 변환시킨 sum을scores.length(5)로 나눈값을 대입한다
	System.out.println("평균점수="+avg);//평균점수 호출
}
}
