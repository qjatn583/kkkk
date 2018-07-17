package ja0605;

public class ArratLengthExample {
public static void main(String[]args) {
	int[]scores= {83,90,97};//정수형 scores라는 배열에 83,90,97을 생성
	int sum =0;//정수형 sum을 0으로 선언
	for(int i=0;i<scores.length;i++) {//for문을 이용해 0부터시작해 scores의 길이만큼 반복
	sum	+=scores[i];//scores[i]의 합계를 알려준다
	System.out.println("총합:"+sum);//총합260을 호출
	double avg=(double)sum/scores.length;//평균을 의미하는변수avg를 강제변환을 이용해 합계
	//나누기 scores의 길이 즉3으로 나눈다.
	System.out.println("평균:"+avg);//평균을 호출
		
	}
}
}
