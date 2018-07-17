package ja0601;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class dictionary {

	public static void main(String[] args) {
		List<String>list =new ArrayList<String>();
		Scanner scan= new Scanner(System.in);
		
		System.out.println("단어를 입력해주세요:");
		String word = scan.next();
		list.add("사과");
		System.out.println("apple");
		list.add("바나나");
		System.out.println("banana");
		list.add("핸드폰");
		System.out.println("phone");
		list.add("시계");
		System.out.println("clock");
	    list.add("돈");
	    System.out.println("money");
		
		
		/*for(int i=0;i<5;i++) {
			System.out.println("단어를 입력해주세요:");
			String word = scan.next();
			list.add(word);*/

	}

}
