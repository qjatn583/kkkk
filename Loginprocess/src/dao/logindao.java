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
//selectLoginMember메소드정의
/*
 * 아이디,비번 넘겨받아서 DB에 쿼리문 전송
 * 쿼리문 실행결과를 User클래스에 담아서 자신을 호출한 클래스로
 * 호출결과 리턴
 * */

public Users selectLoginMember(String id,String password) {
	PreparedStatement pstmt= null;
	//쿼리문 호출 결과를 담을 Users 타입의 객체
	Users loginMember= null;
	ResultSet rs =null;
	String sql =" SELECT* FROM USERS WHERE ID=? AND PASSWORD=?";
	try {
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			//Users 클래스 타입의 객체 loginmember선언

			loginMember = new Users();
			//Users 클래스의 set메소드를 이용하여 
			//DB조회결과를 각 필드에 저장
			/*1.DB조회결과를 가져오는 방법
			 * id컬럼값 조회
			 * rs,getString("id")
			 * 2.User 객체(loginMember)에 id필드값 저장하는 방법
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