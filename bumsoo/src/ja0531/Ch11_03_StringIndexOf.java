package ja0531;

public class Ch11_03_StringIndexOf {

	public static void main(String[] args) {
		//indexOf()�޼ҵ�
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println("location�� ��"+location);
		
		//length()�޼ҵ�
		int length = subject.length();
		System.out.println("length�� ��"+length);
		
		//replace()�޼ҵ�
		String newStr = subject.replace("�ڹ�", "Java");
		System.out.println("newStr�� ��:"+newStr);
		//substring()�޼ҵ�
		String ssn = "123456-1234567";
		String firstNum = ssn.substring(0, 6);
		String SecondNum = ssn.substring(7);
		System.out.println("firstNum�� ��:"+firstNum);
		System.out.println("SecondNum�� ��:"+SecondNum);
		
		if(subject.indexOf("�ڹ�")!=-1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}else {
			System.out.println("�ڹٿ� ���õ� å�� ������");}
			//toLowerCase(),toUpperCase()�޼ҵ�
			String str3="ADADSffAFSAFSDqlkjfolahgblASDASDA";
			String str3Lower = str3.toLowerCase();
			String str3Upper = str3.toUpperCase();
			System.out.println("str3Lower�� ��:"+str3Lower);
			System.out.println("str3Upper�� ��:"+str3Upper);
			
			//trim()�޼ҵ�
			String tel1= "  03";
			String tel2= " 525203";
			String tel3= "214165143      ";
			String tel=tel1.trim()+tel2.trim()+tel3.trim();
			System.out.println(tel);
			
			
		}
	}


