package dao;
//dao:data access obiect
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
public class logindao {
	private static logindao logindao;
	private Connenction con;
	private logindao();
}
public static dao getInstance() {
	if(logindao==null) {
		logindao==new logindao();
		
	}return logindao;
	
}
public void setConnection(Connection con) {
	this.con=con;
	
}
//selectLoginMember�޼ҵ�����
/*
 * ���̵�,��� �Ѱܹ޾Ƽ� DB�� ������ ����
 * ������ �������� UserŬ������ ��Ƽ� �ڽ��� ȣ���� Ŭ������
 * ȣ���� ����
 * */

public Users selectLoginMember(String id,String password) {
	PreparedStatement pstmt= null;
	//������ ȣ�� ����� ���� Users Ÿ���� ��ü
	Users loginMember= null;
	ResultSet rs =null;
	String sql =" SELECT* FROM USERS WHERE ID=? AND PASSWORD=?";
	try {
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			//Users Ŭ���� Ÿ���� ��ü loginmember����

			loginMember = new Users();
			//Users Ŭ������ set�޼ҵ带 �̿��Ͽ� 
			//DB��ȸ����� �� �ʵ忡 ����
			/*1.DB��ȸ����� �������� ���
			 * id�÷��� ��ȸ
			 * rs,getString("id")
			 * 2.User ��ü(loginMember)�� id�ʵ尪 �����ϴ� ���
			 * loginMember.setId(id)
			 * */
	//	String db_id =rs.getString("id");
	loginMember.setId(rs.getString("id"));
	loginMember.setPasswort(rs.getString("password"));
	loginMember.setName(rs.getString("name"));
	loginMember.setAddress(rs.getString("address"));
	loginMember.setId(rs.getString("age"));
	loginMember.setEmail(rs.getString("email"));
	loginMember.setGender(rs.getString("gender"));
	loginMember.setName(rs.getString("nation"));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
			try {
				close(rs);
				close(pstst);
			}catch
			
		}
	}
private void close(ResultSet rs) {
	// TODO Auto-generated method stub
	
}
	return null;
}