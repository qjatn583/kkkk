package dao;

import static db.jdbcutil.*;
import java.sql.*;
import java.util.ArrayList;

import javax.sql.*;
import bean.BoardBean;

public class BoardDAO {
DataSource ds;
Connection con;
private static BoardDAO boardDAO;

PreparedStatement pstmt = null;
ResultSet rs = null;

private BoardDAO() {
	
}
public static BoardDAO getInstance() {
	if(boardDAO == null) {
		boardDAO = new BoardDAO();
	}
	return boardDAO;
	
	
}

public void setConnection(Connection con) {
	this.con=con;
}

public int registArticle(BoardBean boardBean) {
int num=0;
int insertCount =0;

System.out.println("BOARD WRITE DAO START");

String sql1 = "SELECT MAX(BOARD_NUM) FROM BOARD";
String sql2 = "INSERT INTO BOARD VALUES (?,?,?,?,?,?,?,?,?,?,SYSDATE)";


try {
	//글번호를 1씩 증가시키기 위한 부분
	pstmt = con.prepareStatement(sql1);
	rs=pstmt.executeQuery();
	if(rs.next()) {
		num=rs.getInt(1)+1;
	}else {
		num =1;
	}
	//글 등록을 위한 부분
	pstmt=con.prepareStatement(sql2);
	pstmt.setInt(1,num);
	pstmt.setString(2, boardBean.getBOARD_NAME());
	pstmt.setString(3, boardBean.getBOARD_PASS());
	pstmt.setString(4, boardBean.getBOARD_SUBJECT());
	pstmt.setString(5, boardBean.getBOARD_CONTENT());
	pstmt.setString(6, boardBean.getBOARD_FILE());
	pstmt.setInt(7,num);
	pstmt.setInt(8,0);
	pstmt.setInt(9,0);
	pstmt.setInt(10,0);
	
	insertCount = pstmt.executeUpdate();
}catch(Exception e) {
	System.out.println("글쓰기오류"+e);
	
}finally {
	close(rs);
	close(pstmt);
}

System.out.println("BOARD WRITE DAO END");

return insertCount;
}
public ArrayList<BoardBean> getBoardList(){
	String sql = "SELECT * FROM BOARD";
	ArrayList<BoardBean> boardList = 
			new ArrayList<BoardBean>();
			BoardBean boardBean =null;
			try {
				pstmt = con.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				if(rs.next()) {
					do {
					boardBean = new BoardBean();
					boardBean.setBOARD_NUM(rs.getInt("BOARD_NUM"));
					boardBean.setBOARD_NAME(rs.getString("BOARD_NAME"));
					boardBean.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
					boardBean.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
					boardBean.setBOARD_FILE(rs.getString("BOARD_FILE"));
					boardBean.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
					boardBean.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
					boardBean.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
					boardBean.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
					boardBean.setBOARD_DATE(rs.getDate("BOARD_DATE"));
					boardList.add(boardBean);
				}while(rs.next());
				}
			} catch(Exception e) {
				System.out.println("boardList오류"+e);
				
			}finally {
				close(rs);
				close(pstmt);
}
			return boardList;
}
public int upDateCount(int boardNum) {
	int updateCount = 0 ;
	String sql= "UPDATE board SET BOARD_READCOUNT=(BOARD_READCOUNT+1) WHERE BOARD_NUM=?";
	try { 
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, boardNum);
		updateCount =pstmt.executeUpdate();
		
	}catch(Exception e) {
		System.out.println("조회수 올리기 오류"+e);
		
	}finally {
		
		close(pstmt);
	
	}return updateCount;
	}
	//글 상세보기 메소드
	public BoardBean selectArticle(int boardNum) {
		BoardBean boardBean =null;
		String sql = "SELECT * FROM BOARD WHERE BOARD_NUM = ?";
		
		try { 
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, boardNum); 
			rs= pstmt.executeQuery();
			if(rs.next()){
				boardBean = new BoardBean();
				boardBean.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				boardBean.setBOARD_NAME(rs.getString("BOARD_NAME"));
				boardBean.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				boardBean.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				boardBean.setBOARD_FILE(rs.getString("BOARD_FILE"));
				boardBean.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				boardBean.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				boardBean.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				boardBean.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				boardBean.setBOARD_DATE(rs.getDate("BOARD_DATE"));
				
			}
		
	}catch(Exception e) {
		System.out.println("글 상세보기 오류"+e);
		
	}finally {
		close(rs);
		close(pstmt);
	}
	return boardBean;
	}
	//글 수정시 비밀번호 확인을 위한 메소드
	public boolean isArticlePass(int boardNum,String boardPass) {
		String sql = "SELECT * FROM BOARD2 WHERE BOARD_NUM=?";
		boolean isRight = false;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,boardNum);
			rs=pstmt.executeQuery();
			rs.next();
			
			if(boardPass.equals(rs.getString("BOARD_PASS"))) {
				isRight = true;
			}
		}catch(Exception e) {
			System.out.println("비밀번호 검증 오류:"+e);
			
		}finally {
			close(pstmt);
			close(rs);
		}
	
	return isRight;
}


	//글수정 메소드
	public int modifyArticle(BoardBean boardBean) {
		int updateCount = 0;
		String sql="UPDATE BOARD SET BOARD_SUBJECT=? AND BOARD_CONTENT=?+WHERE BOARD_NUM=?";
	try {
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1,boardBean.getBOARD_SUBJECT());
		pstmt.setString(2,boardBean.getBOARD_CONTENT());
		pstmt.setInt(3,boardBean.getBOARD_NUM());
		updateCount = pstmt.executeUpdate();
	}catch(Exception e) {
		System.out.println("비밀번호 검증 오류:"+e);
		
	}finally {
		close(pstmt);

}
	return updateCount;
	}
}
