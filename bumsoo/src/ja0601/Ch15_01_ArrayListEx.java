package ja0601;

import java.awt.List;
import java.util.ArrayList;

public class Ch15_01_ArrayListEx {

	public static void main(String[] args) {
		//ArrayList 선언
		List<String> list= new ArrayList<String>();
		//<>:제네릭(Generic)(번거로운 타입변환을 제거해주는 역할)
/*
 * List list = new ArrayList();
 * list.add("홍길동");
 * Object obj = lit.get(0);
 * String name=(String)obj;*/
		list.add("홍길동");
		String name = list.get(0);
		System.out.println(name);
		

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("myBatis");
		
		int size = list.size();
		System.out.println("list의 크기"+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2번 인덱스에 담긴 데이터:"+skill);
		System.out.println();
		//list에 담긴 모든 내용을 반복문을 이용해여
		for(int i=0;i<list.size;i++) {
			String str = list.get(i);
			System.out.println(list.get(i));
		}
				//list에 담긴 데이터 삭제
		list.remove(2);//Database삭제
		list.remove(2);//Servlet/JSP삭제
		list.remove("JDBC");
	}

}
