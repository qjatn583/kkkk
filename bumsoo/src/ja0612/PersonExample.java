package ja0612;

public class PersonExample {
public static void main(String[]args) {
	Person p1 = new Person("123456-1234567","���");//Person Ŭ�������� ������ ������ new�����ڸ� �̿��� name,ssn��
	//������ �Է����ְ� �׳����� p1�� ����
	System.out.println(p1.nation);//p1�ȿ��ִ� nation���� ȣ��
	System.out.println(p1.ssn);//p1�ȿ��ִ� ssn����ȣ��
	System.out.println(p1.name);//p1�ȿ��ִ� name����ȣ��
	
	p1.name = "��������"
}
}
