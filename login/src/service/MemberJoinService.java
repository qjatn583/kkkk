package service;

import java.sql.*;
import static db.JdbcUtil.*;
import bean.MemberBean;
import dao.MemberDAO;

public class MemberJoinService {

	public boolean joinMember(MemberBean member) {
		//MemberDAO 클래스를 싱클톤으로 사용 (MemberDAO를 객체로)
		MemberDAO memberDAO = MemberDAO.getInstance();
		//DB 접속 
		Connection con = getConnection();
		memberDAO.setConnection(con);
		
		boolean joinResult = false;
		
		int result = memberDAO.insertMember(member);
		
		if(result > 0) {
			joinResult = true;
			commit(con);
		} else {
			joinResult = false;
			rollback(con);
		}
		
		close(con);
		return joinResult;
	}

	/*
	 * joinMember 메소드 정의 
	 * 1. DB 접속
	 * 2. MemberDAO 클래스의 insertMember() 메소드를 호출 
	 * 3. 호출결과를 가지고 insert 성공하면 true 리턴 & commit 
	 * 		실패하면 false 리턴 & rollback
	 */
}
