package ja0531;

public class Ch10_02_ArrayIndex {
public static void main(String[]args) {
	try{int[]num=new int[3];
	for(int i=0;i<=num.length;i++) {
		num[i]=1;
	}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
	}finally {
		System.out.println("finally�� ������ �����");
	}
}
}
