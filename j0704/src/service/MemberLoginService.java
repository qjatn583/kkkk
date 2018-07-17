package service;
import static DB.jdbcutil.*;

import java.sql.Connection;

import bean.MemberBean;
import dao.MemberDAO;
public class MemberLoginService {
	public static boolean login(MemberBean member) {
		//Connection: java.sql 이 제공하는 인터페이스
		//getConnection()메소드:jdbcUtil에서 정의한 DB접속용
		
		Connection con= getConnection();
		MemberDAO memberDAO =MemberDAO.getInstance();
		//dao 객체에 db접속 정보를 넘겨줌.
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