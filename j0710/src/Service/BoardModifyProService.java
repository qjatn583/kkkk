package Service;

import dao.BoardDAO;

public class BoardModifyProService {
public boolean isArticlePass(int boardNum,String boardPass) {
	boolean isArticlePass =false;
	BoardDAO boardDAO = BoardDAO.getConnention();
	Connection con = getConnection();
	boardDAO.setConnection(con);

	isArticlePass=boardDAO.
}
}
