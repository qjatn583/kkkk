package ja0528;

public class StudentEx {
public static void main(String[]args) {
	Student student = 
			new Student("�̸�","123456-1233445",10);
	//�θ�Ŭ������ �ʵ�
	System.out.println(student.name);
	System.out.println(student.ssn);
	
	//�ڽ�Ŭ���� �ʵ�
	System.out.println(student.studentNo);
}
}
