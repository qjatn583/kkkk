package ja0601;

import java.util.*;

//Set���� p.737
public class Ch15_03_HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("myBatis");
		set.add("Java");//Set�� �ߺ��� ���� ������ �Ǹ� 1���� ó����

		int size = set.size();
		System.out.println("set�� ��� �� ������ ��:"+size);
		
		//Set�� ����ִ� ��� ������ ��������
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		set.remove("JDBC");
		
		//set�� �ִ³�����ü����
		set.clear();
		set.isEmpty();
	}
}
