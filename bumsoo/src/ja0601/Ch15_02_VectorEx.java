package ja0601;

import java.util.*;

public class Ch15_02_VectorEx {
public static void main(String[]args) {
	List<Ch15_02_Board>list = new Vector<Ch15_02_Board>();
	
	list.add(new Ch15_02_Board("����1","�۳���","�����1"));
	list.add(new Ch15_02_Board("����2","�۳���","�����2"));
	list.add(new Ch15_02_Board("����3","�۳���","�����3"));
	list.add(new Ch15_02_Board("����4","�۳���","�����4"));
	list.add(new Ch15_02_Board("����5","�۳���","�����5"));
	
	for(int i=0;i<list.size();i++) {
		Ch15_02_Board board = list.get(i);
		System.out.println(board.subject+"\t");
		System.out.println(board.content+"\t");
		System.out.println(board.writer+"\t");
		System.out.println();
	}
}
}
