package service;

import static db.JdbcUtil.*;

import java.sql.*;

import bean.MemberBean;
import dao.MemberDAO;

public class MemberViewService {
	
	public MemberBean getMember(String viewId) {
	Connection con = getConnection();
	MemberDAO memberDAO = MemberDAO.getInstance();
	memberDAO.setConnection(con);
	
	//DAO 클래스 메소드 호출해서 결과를 받아옴. 
	MemberBean member = memberDAO.selectMember(viewId);
	close(con);
	return member;
	}
	
	
}











