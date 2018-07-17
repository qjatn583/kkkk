package service;

import static DB.jdbcutil.getConnection;

import java.sql.Connection;

import bean.MemberBean;
import dao.MemberDAO;

public class MemberViewService {
	public MemberBean getMember(String viewId) {
	
	
	
	//MemberDAO 클래스를 싱글톤으로 사용
			MemberDAO memberDAO =MemberDAO.getInstance();
			//DB접속
			Connection con= getConnection();
			memberDAO.setConnection(con);
			//DAO클래스 메소드 호출해서 결과를 받아옴
			MemberBean member = memberDAO.selectMember(viewId);
			close(con);
			return member;
			
}
}