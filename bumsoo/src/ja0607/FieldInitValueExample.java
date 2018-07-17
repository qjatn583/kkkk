package ja0607;

public class FieldInitValueExample {
public static void main(String[]args) {
	FieldInitValue fiv = new FieldInitValue(); //new연산자를 이용해 FieldInitValue Class에 있는 정보를 fiv에 대입한다.
	
	
	System.out.println("byteField:"+fiv.byteField);//FieldInitValue의 정보가 있는 fiv를 이용해 byteField의 정보를 가져온다
	System.out.println("shortField:"+fiv.shortField);
	System.out.println("intField:"+fiv.intField);
	System.out.println("longField:"+fiv.longField);
	System.out.println("booleanField:"+fiv.booleanField);
	System.out.println("charField:"+fiv.charField);
	System.out.println("floatField:"+fiv.floatField);
	System.out.println("doubleField"+fiv.doubleField);
	System.out.println("arrField:"+fiv.arrField);
	System.out.println("referenceField:"+fiv.referenceField);
}
}
