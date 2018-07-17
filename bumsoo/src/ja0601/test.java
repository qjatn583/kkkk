package ja0601;

import java.util.*;


import f518.Array;

public class test {
public static void main(String[]args) {
	
	List<String>list = new ArrayList<String>();
	Scanner scan= new Scanner(System.in);
	/*list.add("aaa");
	list.add("bbbb");
	list.add("ccccc");
	list.add("dddddd");
	list.add("eeeeeee");*/
	
	/*for(int i=0;i<list.size();i++) {
		
}
System.out.println(list.get(4));*/
	for(int i=0;i<5;i++) {
		System.out.println("이름을 입력해주세요:");
		String name = scan.next();
		list.add(name);
	}
	for(int i=0;i<list.size();i++) {
		String name = list.get(i);
		System.out.println(name);
	}
	int longname = 0;
	for(int i=1;i<list.size();i++) {
		if(list.get(longname).length()<list.get(i).length()) {
			longname=i;
			
		}
	}
System.out.println("가장 긴 이름은:"+list.get(longname));
}
}