package ja0601;

import java.awt.List;
import java.util.ArrayList;

public class Ch15_01_ArrayListEx {

	public static void main(String[] args) {
		//ArrayList ����
		List<String> list= new ArrayList<String>();
		//<>:���׸�(Generic)(���ŷο� Ÿ�Ժ�ȯ�� �������ִ� ����)
/*
 * List list = new ArrayList();
 * list.add("ȫ�浿");
 * Object obj = lit.get(0);
 * String name=(String)obj;*/
		list.add("ȫ�浿");
		String name = list.get(0);
		System.out.println(name);
		

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("myBatis");
		
		int size = list.size();
		System.out.println("list�� ũ��"+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2�� �ε����� ��� ������:"+skill);
		System.out.println();
		//list�� ��� ��� ������ �ݺ����� �̿��ؿ�
		for(int i=0;i<list.size;i++) {
			String str = list.get(i);
			System.out.println(list.get(i));
		}
				//list�� ��� ������ ����
		list.remove(2);//Database����
		list.remove(2);//Servlet/JSP����
		list.remove("JDBC");
	}

}
