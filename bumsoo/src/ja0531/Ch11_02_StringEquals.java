package ja0531;

public class Ch11_02_StringEquals {
public static void main(String[]args) {
	String str1 = new String("�̸�");
	String str2= "�̸�";
	
	if(str1==str2) {
		System.out.println("����String��ü�� ����");
	}else {
		System.out.println("�ٸ�String��ü�� ����");
	}if(str1.equals(str2)) {
		System.out.println("���� ���ڿ��� ����");
		
	}else {
		System.out.println("�ٸ� ���ڿ�������");
	}
}
}
