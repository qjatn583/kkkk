package ja0607;

public class KoreanExample {
public static void main(String[]args) {
	Korean k1 = new Korean("���ڹ�","012345-0123456");//Korean Ŭ�������� ������ ������ k1�� name=���ڹ�,ssn=
	//012345-0123456�� ������ �����Ѵ�.
	System.out.println("k1.name:"+k1.name);//k1�� �ִ� name�� ȣ���Ѵ�
	System.out.println("k1.ssn:"+k1.ssn);//k1�� �ִ� ssn�� ȣ���Ѵ�
	
	Korean k2 = new Korean("���ڹ�","951113-1234568");//KoreanŬ�������� ������ ������ k2�� name=���ڹ�,ssn=
	//951113-1234568�� ������ ������
	System.out.println("k2.name:"+k2.name);//k2�� �ִ� name�� ȣ���Ѵ�
	System.out.println("k2.ssn:"+k2.ssn);//k2�� �ִ� ssn�� ȣ��
}
}
