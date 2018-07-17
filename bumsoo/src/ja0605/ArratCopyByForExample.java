package ja0605;

public class ArratCopyByForExample {
public static void main(String[]args) {
	int[]oldIntArray= {1,2,3};//정수인 oldIntArray배열을 1,2,3으로선언
	int[]newIntArray=new int[5];//정수인 newIntArray배열에 5개의 int로 선언
	
	for(int i=0;i<oldIntArray.length;i++) {//i를 0부터 시작하고 oldIntArray의 길이만큼 반복
		newIntArray[i]= oldIntArray[i];//newIntArray[i]안에oldIntArray[i]대입
	}
	
	for(int i=0;i<newIntArray.length;i++) {//i를 0부터 시작해 newIntArray의 길이만큼 반복
		System.out.println(newIntArray[i]+",");//oldIntArray[i]을 대입한 newIntArray[i]를 호출하고 0,0호출
	}
}
}
