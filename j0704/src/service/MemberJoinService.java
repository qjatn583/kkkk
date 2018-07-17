package service;

import static DB.jdbcutil.*;

import java.sql.*;

import bean.MemberBean;
import dao.MemberDAO;

public class MemberJoinService {
/*
 * joinMember메소드정의
 * 1.DB접속
 * 2.MemberDAO클래스의insertMember()메소드를 호출
 * 3.호출결과를 가지고 insert성공하면 true리턴&commit
 * 실패하면 false리턴 &rollback
 * 
 * */


	public boolean joinMember(MemberBean member) {
		//MemberDAO 클래스를 싱글톤으로 사용
		MemberDAO memberDAO =MemberDAO.getInstance();
		//DB접속
		Connection con= getConnection();
		
		memberDAO.setConnection(con);
		
		//MemberDAO클래스의insertMember()메소드를 호출
		boolean joinResult = false;
		System.out.println("검사 service 1-1"+member.getId());
		int result = memberDAO.insertMember(member);
		
		if(result>0) {
			System.out.println("검사 service 1-2");
			joinResult = true;
			commit(con);
		
		}else {
		joinResult = false;
		rollback(con);
	}
	close(con);
	return joinResult;
		
		
	}

	



	
}


	

		




