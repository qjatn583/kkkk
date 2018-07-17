package ja0601;

import java.util.*;

//Set예제 p.737
public class Ch15_03_HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("myBatis");
		set.add("Java");//Set은 중복된 값이 들어오게 되면 1개로 처리함

		int size = set.size();
		System.out.println("set에 담긴 총 데이터 수:"+size);
		
		//Set에 들어있는 모든 데이터 가져오기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		set.remove("JDBC");
		
		//set에 있는내용전체삭제
		set.clear();
		set.isEmpty();
	}
}
