package ja0601;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class dictionary {

	public static void main(String[] args) {
		List<String>list =new ArrayList<String>();
		Scanner scan= new Scanner(System.in);
		
		System.out.println("�ܾ �Է����ּ���:");
		String word = scan.next();
		list.add("���");
		System.out.println("apple");
		list.add("�ٳ���");
		System.out.println("banana");
		list.add("�ڵ���");
		System.out.println("phone");
		list.add("�ð�");
		System.out.println("clock");
	    list.add("��");
	    System.out.println("money");
		
		
		/*for(int i=0;i<5;i++) {
			System.out.println("�ܾ �Է����ּ���:");
			String word = scan.next();
			list.add(word);*/

	}

}
