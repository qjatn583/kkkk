package ja0605;

public class ArrayReferenceobjectExample {
public static void main(String[]args) {
	String[]strArray = new String[3];//String변수인 strArray에 new String[3]을 대입
	strArray[0] = "Java";//strArray[0]에 java대입
	strArray[1] = "Java";//strArray[1]에 java대입
	strArray[2] =new String("Java");//새로운 객체인 java를 선언해 strArray[2]에 대입
	
	System.out.println(strArray[0]==strArray[1]);//strArray[0]과 strArray[1]을 비교한 결과 true가 나온다
	System.out.println(strArray[0]==strArray[2]);//strArray[0]과 strArray[2]을 비교한 결과 false가 나온다
	System.out.println(strArray[0].equals(strArray[2]));//equals를 이용해 비교했기 때문에 true가 나온다
	
			}
}
