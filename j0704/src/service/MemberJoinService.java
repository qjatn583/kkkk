package service;

import static DB.jdbcutil.*;

import java.sql.*;

import bean.MemberBean;
import dao.MemberDAO;

public class MemberJoinService {
/*
 * joinMember�޼ҵ�����
 * 1.DB����
 * 2.MemberDAOŬ������insertMember()�޼ҵ带 ȣ��
 * 3.ȣ������ ������ insert�����ϸ� true����&commit
 * �����ϸ� false���� &rollback
 * 
 * */


	public boolean joinMember(MemberBean member) {
		//MemberDAO Ŭ������ �̱������� ���
		MemberDAO memberDAO =MemberDAO.getInstance();
		//DB����
		Connection con= getConnection();
		
		memberDAO.setConnection(con);
		
		//MemberDAOŬ������insertMember()�޼ҵ带 ȣ��
		boolean joinResult = false;
		System.out.println("�˻� service 1-1"+member.getId());
		int result = memberDAO.insertMember(member);
		
		if(result>0) {
			System.out.println("�˻� service 1-2");
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


	

		




