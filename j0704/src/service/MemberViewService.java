package service;

import static DB.jdbcutil.getConnection;

import java.sql.Connection;

import bean.MemberBean;
import dao.MemberDAO;

public class MemberViewService {
	public MemberBean getMember(String viewId) {
	
	
	
	//MemberDAO Ŭ������ �̱������� ���
			MemberDAO memberDAO =MemberDAO.getInstance();
			//DB����
			Connection con= getConnection();
			memberDAO.setConnection(con);
			//DAOŬ���� �޼ҵ� ȣ���ؼ� ����� �޾ƿ�
			MemberBean member = memberDAO.selectMember(viewId);
			close(con);
			return member;
			
}
}