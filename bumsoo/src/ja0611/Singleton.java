package ja0611;

public class Singleton {
private static Singleton singleton = new Singleton();//외부에서 생성자 호출을 하지 못하게 private을 써줘서 Singleton의 
//정보를 singleton에 대입해준다
private Singleton() {}//singleton 생성자 선언
static Singleton getInstance() {//Singleton안에 getInstance메소드생성
	return singleton;//singleton 결과 리턴
}
}
