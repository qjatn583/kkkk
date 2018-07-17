package ja0531;

public class Ch11_03_StringIndexOf {

	public static void main(String[] args) {
		//indexOf()메소드
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println("location의 값"+location);
		
		//length()메소드
		int length = subject.length();
		System.out.println("length의 값"+length);
		
		//replace()메소드
		String newStr = subject.replace("자바", "Java");
		System.out.println("newStr의 값:"+newStr);
		//substring()메소드
		String ssn = "123456-1234567";
		String firstNum = ssn.substring(0, 6);
		String SecondNum = ssn.substring(7);
		System.out.println("firstNum의 값:"+firstNum);
		System.out.println("SecondNum의 값:"+SecondNum);
		
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련된 책이 없군요");}
			//toLowerCase(),toUpperCase()메소드
			String str3="ADADSffAFSAFSDqlkjfolahgblASDASDA";
			String str3Lower = str3.toLowerCase();
			String str3Upper = str3.toUpperCase();
			System.out.println("str3Lower의 값:"+str3Lower);
			System.out.println("str3Upper의 값:"+str3Upper);
			
			//trim()메소드
			String tel1= "  03";
			String tel2= " 525203";
			String tel3= "214165143      ";
			String tel=tel1.trim()+tel2.trim()+tel3.trim();
			System.out.println(tel);
			
			
		}
	}


