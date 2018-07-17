package ja0530;

public class Ch7_11_InstanceofEx {
	public static void method(Ch7_11_Parent parent) {
		//parent������ Ch7_11_Child Ŭ���� Ÿ������?
		if (parent instanceof Ch7_11_Child) {
			//parent������ ChildŬ����Ÿ������ ������ȯ�ؼ�
			//ChildŬ���� Ÿ���� ���� child�� �����Ѵ�.
			Ch7_11_Child child=(Ch7_11_Child)parent;
			System.out.println("method1-Child�� ��ȯ ����");
		}else {
			System.out.println("method2-Child�� ��ȯ��������");
		}
	}
	public static void method2(Ch7_11_Child parent1) {
		System.out.println("method2 - Child�� ��ȯ ����");
	}
public static void main(String[]args) {
	/*��ü Ÿ�� Ȯ���� ���� instanceof������
	 * ����Ÿ�Ժ�ȯ�� �������� ���θ� �Ǵ��ϱ� ���� ����ϴ� ������*/
	/*Parent Ÿ���� ������ �����ؼ� Child��ü�� ����
	 *method1,2�� ����ȣ��
	 *ParentŸ���� ������ �����ؼ�Parent��ü�� ����
	 *method1,2�� ����ȣ��*/
	Ch7_11_Child parent1 = new Ch7_11_Child();
	method1(parent1);
	method2(parent1);
	Ch7_11_Child parent2 = new Ch7_11_Child();
	method1(parent2);//������ ������ ��ȯ�� �ȵ�
	method2(parent2);//����
}
private static void method1(Ch7_11_Child parent1) {
	// TODO Auto-generated method stub
	
}
}
