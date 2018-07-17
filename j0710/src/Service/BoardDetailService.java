package Service;
import java.sql.Connection;

import bean.BoardBean;
import dao.BoardDAO;
import static db.jdbcutil.*;


public class BoardDetailService {
public BoardBean getArticle(int boardNum) {
	Connection con = getConnection();
	BoardDAO boardDAO =BoardDAO.getInstance();
	boardDAO.setConnection(con);
	
	
	BoardBean article = null;
	//��ȸ�� �ø���
	int updateCount = boardDAO.upDateCount(boardNum);
	if(updateCount>0) {
		commit(con);
	}else {
		rollback(con);
	}
	//���õ� �Խñ� ���� ��������
	article = boardDAO.selectArticle(boardNum);
	close(con);
	
	return article;
}


}

