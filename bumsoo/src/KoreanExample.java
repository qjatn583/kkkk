
public class KoreanExample {
public static void main(String[]args) {
	//������ �̸��� �ֹι�ȣ ���ڸ��� k1,k2��ü�� ���� �����ؼ� �ʵ尪�� ����غ�����.
	Korean k1 = new Korean("�����","951113");
	Korean k2 = new Korean("������","930516");
	System.out.println("�̸�:"+k1.name);
	System.out.println("�ֹι�ȣ:"+k1.ssn);
	System.out.println("�̸�:"+k2.name);
	System.out.println("�ֹι�ȣ:"+k2.ssn);
	System.out.println("���Ÿ�������");	
	}
}

