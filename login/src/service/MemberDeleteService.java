package service;

import static db.JdbcUtil.*;

import java.sql.*;
import dao.MemberDAO;

public class MemberDeleteService {
	public boolean deleteMember(String delId) {
	
	Connection con = getConnection();
	MemberDAO memberDAO = MemberDAO.getInstance();
	memberDAO.setConnection(con);
	
	boolean deleteResult = false;
	
	int deleteCount = memberDAO.deleteMember(delId);
	
	if(deleteCount>0) {
		commit(con);
		deleteResult = true;
	} else {
		rollback(con);
		deleteResult = false;
	}
	close(con);
	return deleteResult;
	
	}
}









