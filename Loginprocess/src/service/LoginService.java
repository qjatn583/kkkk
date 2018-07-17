package service;
import bean.Users;
import static db.JdbcUtil.*;
import java.sql.*;
import logindao.logindao;
public class LoginService {
public Users getLoginMember(String id, String password) {
	logindao logindao =logindao.getInstance();
	Connection con= getConnection();
	logindao.setConnection(con);
	Users loginMember = logindao.selectLoginMember(id,password);
	close}(con);
	return loginMember;
}
}
