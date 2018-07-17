package service;

import static db.JdbcUtil.*;

import java.sql.Connection;
import java.util.ArrayList;

import bean.MemberBean;
import dao.MemberDAO;

public class MemberListService {

	public ArrayList<MemberBean> getMemberList() {
		//MemberDAO 클래스를 싱클톤으로 사용 (MemberDAO를 객체로)
		MemberDAO memberDAO = MemberDAO.getInstance();
		//DB 접속 
		Connection con = getConnection();
		memberDAO.setConnection(con);
		
		ArrayList<MemberBean> memberList = 
					memberDAO.selectMemberList();
		close(con);
		
		return memberList;
	}

}
