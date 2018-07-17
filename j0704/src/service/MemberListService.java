package service;

import java.util.ArrayList;
import static DB.jdbcutil.*;
import java.sql.Connection;

import bean.MemberBean;
import dao.MemberDAO;

public class MemberListService {

	public ArrayList<MemberBean> getMemberList(){
		MemberDAO memberDAO = MemberDAO.getInstance();
		
		Connection con = getConnection();
		memberDAO.setConnection(con);
		ArrayList<MemberBean> memberlist = memberDAO.selectMemberList();
		close(con);
		return memberlist;
	}
}
