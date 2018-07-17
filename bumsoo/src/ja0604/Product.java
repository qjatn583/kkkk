package ja0604;
//상품의 정의를 위한 추상클래스 
public abstract class Product {
//필드선언
	String pName;
	int price;
	
	//상품을 구체적 정보 출력을 위한 메소드
	public void printDatail() {
		System.out.println("상품명:"+pName+",");
		System.out.println("가격:"+price+",");
		printExtra();
	}
}
