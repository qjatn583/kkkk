package dao;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.*;

import bean.MemberBean;

import javax.naming.*;
import static db.JdbcUtil.*;

public class MemberDAO {
	/*
	 * �쉶�썝媛��엯 荑쇰━臾� �쟾�넚�쓣 �쐞�븳 insertMember 硫붿냼�뱶 �젙�쓽 
	 */
	
	private static MemberDAO memberDAO;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	public static MemberDAO getInstance() {
		if(memberDAO == null) {
			memberDAO = new MemberDAO();
		}
		return memberDAO;
	}
	
	public void setConnection(Connection con) {
		this.con = con;
	}
	
	//�쉶�썝媛��엯�쓣 �쐞�븳 硫붿냼�뱶 
	public int insertMember(MemberBean member) {
		String sql = "INSERT INTO MEMBERS VALUES(?,?,?,?,?,?)";
		int insertResult = 0;
		
		try {
			//荑쇰━臾� �쟾�넚 以�鍮� 
			pstmt = con.prepareStatement(sql);
			//臾쇱쓬�몴 遺�遺� 梨꾩슦湲� 
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setInt(4, member.getAge());
			pstmt.setString(5, member.getGender());
			pstmt.setString(6, member.getEmail());
			//荑쇰━臾� �떎�뻾 
			//INSERT, DELETE, UPDATE 荑쇰━臾� �떎�뻾�떆�뿉�뒗 executeUpdate()
			//SELECT 荑쇰━臾� �떎�뻾�떆�뿉�뒗 executeQuery() 
			insertResult = pstmt.executeUpdate();
			
		} catch(Exception e) {
			System.out.println("joinMember �삤瑜�!!: " + e);
		} finally {
			close(pstmt);
		}
		return insertResult;
	}
	
	//濡쒓렇�씤�쓣 �쐞�븳 硫붿냼�뱶 
	public String memberLogin(MemberBean member) {
		System.out.println("memberLogin 硫붿냼�뱶 �샇異쒕맖");
		String loginId = null;
		String sql = "SELECT ID FROM MEMBERS WHERE ID=? AND PASSWORD=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				loginId = rs.getString("id");
			}
		}catch(Exception e) {
			System.out.println("loginMember �삤瑜�!! "+e);
		}finally {
			close(pstmt);
		}
		return loginId;
	}

	public ArrayList<MemberBean> selectMemberList() {
		String sql = "SELECT * FROM MEMBERS";
		//議고쉶 寃곌낵瑜� �떞�쓣 List 媛앹껜 �꽑�뼵 
		ArrayList<MemberBean> memberList = 
				new ArrayList<MemberBean>();
		
		MemberBean mb = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				do {
					mb = new MemberBean();
					mb.setId(rs.getString("id"));
					mb.setPassword(rs.getString("password"));
					mb.setName(rs.getString("name"));
					mb.setAge(rs.getInt("age"));
					mb.setGender(rs.getString("gender"));
					mb.setEmail(rs.getString("email"));
					
					memberList.add(mb);
				}while(rs.next());
			}
		} catch(Exception e) {
			System.out.println("MemberList �삤瑜� !!: "+e);
		}finally {
			close(rs);
			close(pstmt);
		}
		return memberList;
	}

	//�쉶�썝 �긽�꽭�젙蹂� 議고쉶
	public MemberBean selectMember(String viewId) {
		String sql = "SELECT * FROM MEMBERS WHERE ID=?";
		MemberBean mb = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, viewId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mb = new MemberBean();
				mb.setId(rs.getString("id"));
				mb.setPassword(rs.getString("password"));
				mb.setName(rs.getString("name"));
				mb.setAge(rs.getInt("age"));
				mb.setGender(rs.getString("gender"));
				mb.setEmail(rs.getString("email"));
			}
		} catch(Exception e) {
			System.out.println("selectMember �삤瑜� !!"+e);
		} finally {
			close(rs);
			close(pstmt);
		}
		return mb;
	}

	public int deleteMember(String delId) {
		String sql = "DELETE MEMBERS WHERE ID=?";
		int deleteResult = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, delId);
			deleteResult = pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println("deleteMember �삤瑜� !!"+e);
		} finally {
			close(pstmt);
		}
		return deleteResult;
	}
}













