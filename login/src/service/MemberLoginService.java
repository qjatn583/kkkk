package service;

import java.sql.*;
import javax.sql.*;
import static db.JdbcUtil.*;

import bean.MemberBean;
import dao.MemberDAO;

public class MemberLoginService {

	public boolean login(MemberBean member) {
		//Connection : java.sql 이 제공하는 인터페이스 
		//getConnection() 메소드 : jdbcUtil에서 정의한 DB 접속용 메소드
		//DB 접속이 성공하면 console에 connect success 출력됨. 
		Connection con = getConnection();
		
		//MemberDAO 객체 생성
		MemberDAO memberDAO = MemberDAO.getInstance();
		
		//DAO 객체에 DB 접속 정보를 넘겨줌. 
		memberDAO.setConnection(con);
		
		boolean loginResult = false;
		String loginId = memberDAO.memberLogin(member);
		if(loginId != null) {
			loginResult = true;
		}
		close(con);
		return loginResult;
		
	}

}









