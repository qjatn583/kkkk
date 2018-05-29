
public class ch6_12_SingletonEx {
public static void main(String[]args) {
	//일반적으로 객체 생성하는 방식
	ch6_12_Singleton obj2=ch6_12_Singleton.Singleton();
	//싱글톤으로 선언한 클래스를 사용하는 방식
	ch6_12_Singleton obj1=ch6_12_Singleton.getInstance();
}
}
