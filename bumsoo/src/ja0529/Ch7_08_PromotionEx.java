package ja0529;
//�ڵ�Ÿ�Ժ�ȯ����(�ڽ�Ŭ���� Ÿ��->�θ�Ŭ���� Ÿ��)
//AŬ��������
	class A() {
	}
	//AŬ������ �ڽ�Ŭ������ BŬ���� ����
	class B extends A{
	}
	//AŬ������ �ڽ�Ŭ������ CŬ���� ����
	class C extends A{
	}
	//BŬ������ �ڽ�Ŭ������ DŬ���� ����
	class D extends B{
	}
	//CŬ������ �ڽ�Ŭ������ EŬ���� ����
	class E extends C{
	}
public static class Ch7_08_PromotionEx {
public static void main(String[]args) {
    //BŬ���� Ÿ���� ���� b����
	B b = new B();
	//CŬ���� Ÿ���� ���� c����
	C c = new C();
	//DŬ���� Ÿ���� ���� d����
	D d = new D();
	//EŬ���� Ÿ���� ���� e����
	E e = new E();
	
	//���� ������ �����鿡 ���� �ڵ� ����ȯ ���� Ȯ��
	
	//AŬ���� Ÿ���� ���� (a1)��BŬ���� Ÿ�� ���� ����
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1= d;
	C c1= e;
	
	/*B b2 = e;
	C c2 = d;
	
	B b3 =()a1;*/
}


}
