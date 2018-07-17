package Service;
import static db.jdbcutil.*;

import java.sql.Connection;

import bean.BoardBean;
import dao.BoardDAO;
public class BoardWriteService {
	public boolean registArticle(BoardBean boardBean) {
	Connection con = getConnection();
	BoardDAO boardDAO = BoardDAO.getInstance();
	boardDAO.setConnection(con);

boolean WriteResult = false;

int insertCount = boardDAO.registArticle(boardBean);

if(insertCount>0) {
	WriteResult = true;
	commit(con);
}else {
	WriteResult = false;
	rollback(con);
}
	System.out.println("BOARD WRITE SERVICE");
	return WriteResult;

	}
}