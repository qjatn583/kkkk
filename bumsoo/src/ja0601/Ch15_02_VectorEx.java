package ja0601;

import java.util.*;

public class Ch15_02_VectorEx {
public static void main(String[]args) {
	List<Ch15_02_Board>list = new Vector<Ch15_02_Board>();
	
	list.add(new Ch15_02_Board("제목1","글내용","사용자1"));
	list.add(new Ch15_02_Board("제목2","글내용","사용자2"));
	list.add(new Ch15_02_Board("제목3","글내용","사용자3"));
	list.add(new Ch15_02_Board("제목4","글내용","사용자4"));
	list.add(new Ch15_02_Board("제목5","글내용","사용자5"));
	
	for(int i=0;i<list.size();i++) {
		Ch15_02_Board board = list.get(i);
		System.out.println(board.subject+"\t");
		System.out.println(board.content+"\t");
		System.out.println(board.writer+"\t");
		System.out.println();
	}
}
}
