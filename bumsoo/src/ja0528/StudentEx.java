package ja0528;

public class StudentEx {
public static void main(String[]args) {
	Student student = 
			new Student("이름","123456-1233445",10);
	//부모클래스의 필드
	System.out.println(student.name);
	System.out.println(student.ssn);
	
	//자식클래스 필드
	System.out.println(student.studentNo);
}
}
