package service;
import static DB.jdbcutil.*;

import java.sql.Connection;

import bean.MemberBean;
import dao.MemberDAO;
public class MemberLoginService {
	public static boolean login(MemberBean member) {
		//Connection: java.sql �� �����ϴ� �������̽�
		//getConnection()�޼ҵ�:jdbcUtil���� ������ DB���ӿ�
		
		Connection con= getConnection();
		MemberDAO memberDAO =MemberDAO.getInstance();
		//dao ��ü�� db���� ������ �Ѱ���.
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