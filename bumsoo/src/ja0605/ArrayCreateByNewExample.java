package ja0605;

public class ArrayCreateByNewExample {
public static void main(String[]args) {
	int[]arr1=new int[3];//정수형 arr1을 new연산자를 이용해서 3개의 배열을 생성해준다
	for(int i=0;i<3;i++) {//for문을 이용해 정수형i를0으로설정하고0,1,2반복
		System.out.println("arr1["+i+"]:"+arr1[i]);//arr1[i]:i 호출
		}
	arr1[0] = 10;//arr1[0]을 10으로 설정
	arr1[1] = 20;//arr1[1]을 20으로 설정
	arr1[2] = 30;//arr1[2]를 30으로 설정
	for(int i=0;i<3;i++) {//for문을 이용해 정수형i를0으로설정하고0,1,2반복
		System.out.println("arr1["+i+"]:"+arr1[i]);//위에서 설정해준arr1[i]=arr1[i]호출
	}
	double[]arr2=new double[3];//실수인 배열arr2를 new연산자를 이용해 실수인 배열 3개 생성
	for(int i=0;i<3;i++) {//for문을 이용해 정수i를 0부터 0,1,2 반복해준다
		
		
		
	}
}
}
