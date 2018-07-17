package Service;
import static db.jdbcutil.*;
import java.sql.*;
import java.util.ArrayList;

import bean.BoardBean;
import dao.BoardDAO;

public class BoardListService {

	/*public ArrayList<BoardBean> getBoardList(){
		Connection con = getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(con);
		
		ArrayList<BoardBean> boardList = boardDAO.getBoardList();
		
		close(con);
		return boardList;
	}*/
	
	public int gerListCount() {
		Connection con = getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(con);
		
		int listCount = 0;
		listCount = boardDAO.getListCount();
		close(con);
		return listCount;
	}
public ArrayList<>
}
