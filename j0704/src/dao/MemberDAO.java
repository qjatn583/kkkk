package dao;

import java.sql.*;
import java.util.ArrayList;

import static DB.jdbcutil.*;
import bean.MemberBean;



public class MemberDAO {
	public static MemberDAO memberDAO;//MemberDAOŬ������ ������ memberDAO������ �����Ѵ�
	Connection con;//DB���� ��ɾ� ,con�� ����
	PreparedStatement pstmt;//sql�� ������ �����鿡 �� Ʋ�� ������ְ� �׳����� pstmt�� �������ش�
	ResultSet rs;//ResultSet�� ������ �������� ���������� �����Ҽ��ְ� ������ִ¸�ɾ�
	public static MemberDAO getInstance() {//MemberDAO Ŭ�������� getInstance�޼ҵ� ����
		if(memberDAO==null) {//memberDAO���� �ΰ��̸�
			memberDAO = new MemberDAO();//���ο� MemberDAO�޼ҵ带 ������ memberDAO��ü�� ����
		}
		return memberDAO;//memberDAO��ü�� �������ش�
	}
	public void setConnection(Connection con) {
		this.con = con;
	}
	public int insertMember(MemberBean member) {//MemberBean�޼ҵ忡�ִ� ������ member�� ��Ƽ� insertMember��ü�� �������ش� 
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?)";
		//sql������ 6���� Ʋ�� ������ش�
		int insertResult=0;
		//insertResult�� �ʱⰪ�� 0���� �ش�
		try {
			pstmt =con.prepareStatement(sql);
			//�������� ������ �ۼ� 
			pstmt.setString(1,member.getId());
			pstmt.setString(2,member.getPassword());
			pstmt.setString(3,member.getName());
			pstmt.setInt(4,member.getAge());
			pstmt.setString(5,member.getGender());
			pstmt.setString(6,member.getEmail());
			//������ ����
			insertResult = pstmt.executeUpdate();
			//insertResultȣ��
			System.out.println(insertResult);
		}catch(Exception e) {
				System.out.println("joinMember ����:"+e);
		}finally {
			close(pstmt);
			
			}
		
		return insertResult;
		//insertResult�� ����
		
	
		
		}
	public ArrayList<MemberBean>selectMemberList(){
		//selectMemberList( )�� �ִ� ��� ȸ�������� ArrayList�� �Ѱ��ش�.


	}
		String sql="SELECT * FROM MEMBER";
		//DB�� "SELECT * FROM MEMBER";�� �Է�
		
		ArrayList<MemberBean> memberList=
				new ArrayList<MemberBean>();
		//ȸ�������� ���� ArrayList����
		
		MemberBean mb = null;
		//MemberBeanŬ�������ִ� mb�� ������ �ΰ����� �ش�
		try {
			pstmt = con.prepareStatement(sql);//sql���� DB�� ���������� ��ü �����Ѱ� pstmt�� ����
			rs = pstmt.executeQuery();//���̺��� �����͸� �˻��ϴ� ��ɾ rs�� ����
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
			}//rs���� ����� �ִٸ� do while���� �̿��ؼ� �����Ҷ� ���� �ݺ�
		}catch(Exception e) {
			System.out.println("MemberList ����:"+e);
			//�����ϰ�� MemberList ������� ȣ��
		}finally {
			close(rs);
			close(pstmt);
			
		}
	//rs������ pstmt������.
		
		return memberList;
	}
//memberList ����
	
	
	
	
	
	
		public String memberLogin(MemberBean member) {
			String loginId = null;
			String sql = "SELECT ID FROM MEMBER WHERE ID=? AND PASSWORD=?";
			
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				loginId = rs.getString("id");
				
			}
		}catch(Exception e) {
			System.out.println("loginMember ����"+e);
		
		}finally {
			close(rs);
			close(pstmt);
			
		}
		return loginId;
		
		//ȸ�� ��������ȸ
		public MemberBean selectMember(String viewId) {
			String sql = "SELECT * FROM MEMBERS WHERE=?";
			MemberBean mb  = null;
			
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,viewId);
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
			}catch(Exception e) {
				System.out.println("loginMember ����"+e);
			}finally {
				close(rs);
				close(pstmt);
			}
				return mb;
		
		
		
		
		}
			public int deleteMember(String delId) {
				String sql = "DELETE MEMBERS WHERE ID=?";
				int deleteResult = 0;
				
				try {
					pstmt =con.prepareStatement(sql);
					pstmt.setString(1, delId);
					deleteResult = pstmt.executeUpdate();
				}catch(Exception e) {
					System.out.println("deleteMember ����"+e);
			}finally {
				close(pstmt);
			}
				return deleteResult;
		
		}
		}
		}
/*ȸ������ ������ ������ ���� insertMember
 * 
 * */








