package ja0607;

public class KoreanExample {
public static void main(String[]args) {
	Korean k1 = new Korean("박자바","012345-0123456");//Korean 클래스에서 정보를 가져와 k1에 name=박자바,ssn=
	//012345-0123456의 정보를 대입한다.
	System.out.println("k1.name:"+k1.name);//k1에 있는 name을 호출한다
	System.out.println("k1.ssn:"+k1.ssn);//k1에 있는 ssn을 호출한다
	
	Korean k2 = new Korean("김자바","951113-1234568");//Korean클래스에서 정보를 가져와 k2에 name=김자바,ssn=
	//951113-1234568의 정보를 대입함
	System.out.println("k2.name:"+k2.name);//k2에 있는 name을 호출한다
	System.out.println("k2.ssn:"+k2.ssn);//k2에 있는 ssn을 호출
}
}
