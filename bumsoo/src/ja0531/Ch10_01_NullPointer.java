package ja0531;

public class Ch10_01_NullPointer {
	public static void main(String[]args) {
try{String data = null;
System.out.println("���ܹ߻���......");
System.out.println(data.toString());
System.out.println("���ܹ߻���......");
System.out.println(data);
}catch(NullPointException e) {
	System.out.println("���ܰ� �߻������� �ڵ带 Ȯ���� �� ��");
}
}
	}