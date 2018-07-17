package dao;

import java.sql.*;
import java.util.ArrayList;

import static DB.jdbcutil.*;
import bean.MemberBean;



public class MemberDAO {
	public static MemberDAO memberDAO;//MemberDAO클래스의 내용을 memberDAO변수에 대입한다
	Connection con;//DB접속 명령어 ,con에 대입
	PreparedStatement pstmt;//sql에 대입할 변수들에 들어갈 틀은 만들어주고 그내용을 pstmt에 대입해준다
	ResultSet rs;//ResultSet은 설정된 변수값을 순차적으로 접근할수있게 만들어주는명령어
	public static MemberDAO getInstance() {//MemberDAO 클래스에서 getInstance메소드 생성
		if(memberDAO==null) {//memberDAO값이 널값이면
			memberDAO = new MemberDAO();//새로운 MemberDAO메소드를 선언해 memberDAO객체에 대입
		}
		return memberDAO;//memberDAO객체를 리턴해준다
	}
	public void setConnection(Connection con) {
		this.con = con;
	}
	public int insertMember(MemberBean member) {//MemberBean메소드에있는 정보를 member에 담아서 insertMember객체를 생성해준다 
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?)";
		//sql변수에 6개의 틀을 만들어준다
		int insertResult=0;
		//insertResult의 초기값을 0으로 준다
		try {
			pstmt =con.prepareStatement(sql);
			//구조적인 쿼리문 작성 
			pstmt.setString(1,member.getId());
			pstmt.setString(2,member.getPassword());
			pstmt.setString(3,member.getName());
			pstmt.setInt(4,member.getAge());
			pstmt.setString(5,member.getGender());
			pstmt.setString(6,member.getEmail());
			//쿼리문 실행
			insertResult = pstmt.executeUpdate();
			//insertResult호출
			System.out.println(insertResult);
		}catch(Exception e) {
				System.out.println("joinMember 오류:"+e);
		}finally {
			close(pstmt);
			
			}
		
		return insertResult;
		//insertResult값 리턴
		
	
		
		}
	public ArrayList<MemberBean>selectMemberList(){
		//selectMemberList( )에 있는 모든 회원정보를 ArrayList로 넘겨준다.


	}
		String sql="SELECT * FROM MEMBER";
		//DB에 "SELECT * FROM MEMBER";을 입력
		
		ArrayList<MemberBean> memberList=
				new ArrayList<MemberBean>();
		//회원정보를 담을 ArrayList생성
		
		MemberBean mb = null;
		//MemberBean클래스에있는 mb의 정보를 널값으로 준다
		try {
			pstmt = con.prepareStatement(sql);//sql문을 DB에 보내기위한 객체 선언한걸 pstmt에 대입
			rs = pstmt.executeQuery();//테이블에서 데이터를 검색하는 명령어를 rs에 대입
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
			}//rs값에 결과가 있다면 do while문을 이용해서 만족할때 까지 반복
		}catch(Exception e) {
			System.out.println("MemberList 오류:"+e);
			//예외일경우 MemberList 오류라고 호출
		}finally {
			close(rs);
			close(pstmt);
			
		}
	//rs끝내고 pstmt끝낸다.
		
		return memberList;
	}
//memberList 리턴
	
	
	
	
	
	
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
			System.out.println("loginMember 오류"+e);
		
		}finally {
			close(rs);
			close(pstmt);
			
		}
		return loginId;
		
		//회원 상세정보조회
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
				System.out.println("loginMember 오류"+e);
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
					System.out.println("deleteMember 오류"+e);
			}finally {
				close(pstmt);
			}
				return deleteResult;
		
		}
		}
		}
/*회원가입 쿼리문 전송을 위한 insertMember
 * 
 * */








