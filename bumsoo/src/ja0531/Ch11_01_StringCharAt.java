package ja0531;

public class Ch11_01_StringCharAt {

	public static void main(String[]args) {
		//charAt()�޼ҵ�
		String ssn="180531-1234567";
		char gender= ssn.charAt(7);
		switch(gender){
			case'1':
				System.out.println("�����Դϴ�.");
				break;
			case'2':
			System.out.println("�����Դϴ�.");
			break;
			case'3':
				System.out.println("�����Դϴ�.");
				break;
			case'4':
				System.out.println("�����Դϴ�.");
				break;
		}
	}
}
