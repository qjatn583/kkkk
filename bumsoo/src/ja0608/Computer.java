package ja0608;

public class Computer {
int sum1(int[]values) {//sum1이라는 메소드를 선언해주는데 합산의 메소드를 위해 values라는 배열을 선언해준다
	int sum  = 0;//sum이란 변수를 0으로 초기화
	for(int i=0;i<values.length;i++) {//for문을 이용해서 i=0,values의 길이만큼 반복
		sum+=values[i];//values의 배열에 대한 합계
	}
	return sum;//결과를 sum에 저장
}
int sum2(int...values) {//sum2의 메소드를 선언해주고 자동으로 배열이 생성되는...을 이용하여 values배열 선언
	int sum = 0;//sum의 변수를 0으로 초기화
	for(int i=0;i<values.length;i++) {//for문을 이용하는데 i를 0으로 시작해서values의 길이만큼 반복
		sum+=values[i];//values의 배열에 대한 합계
	}
	return sum;//결과를 sum에 저장
}
}
