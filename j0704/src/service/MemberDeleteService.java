package service;

import static DB.jdbcutil.getConnection;

import java.sql.Connection;

import bean.MemberBean;
import dao.MemberDAO;

public class MemberDeleteService {
	public boolean deleteMember(MemberBean member) {
		//MemberDAO Ŭ������ �̱������� ���
		MemberDAO memberDAO =MemberDAO.getInstance();
		//DB����
		Connection con= getConnection();
		
		memberDAO.setConnection(con);
boolean deleteResult = false;
int deleteCount = memberDAO.deleteMember(delId);
if(deleteCount>0) {
	commit(con);
	deleteResult = true;
}else {
	rollback(con);
	deleteResult = false;
}
close(con);
return deleteResult;	
}

	private void commit(Connection con) {
		// TODO Auto-generated method stub
		
	}

	private void close(Connection con) {
		// TODO Auto-generated method stub
		
	}

	private void rollback(Connection con) {
		// TODO Auto-generated method stub
		
	}
}
