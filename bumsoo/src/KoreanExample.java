
public class KoreanExample {
public static void main(String[]args) {
	//본인의 이름과 주민번호 앞자리로 k1,k2객체를 각각 생성해서 필드값을 출력해보세요.
	Korean k1 = new Korean("김범수","951113");
	Korean k2 = new Korean("아이유","930516");
	System.out.println("이름:"+k1.name);
	System.out.println("주민번호:"+k1.ssn);
	System.out.println("이름:"+k2.name);
	System.out.println("주민번호:"+k2.ssn);
	System.out.println("정신못차리네");	
	}
}

