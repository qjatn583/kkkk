package ja0611;

public class SingletonExample {
public static void main(String[]args) {
	Singleton obj1 = Singleton.getInstance();//Singleton 클래스에 있는 getInstance정보를 obj1에 대입
	Singleton obj2 = Singleton.getInstance();//Singleton 클래스에 있는 getInstance정보를 obj2에 대입
	
	if(obj1==obj2) {//obj1과 obj2가 같다면
		System.out.println("같은 Singleton객체입니다");
	}else {
		System.out.println("다른 Singleton객체입니다");	
		}
	
}
}
	