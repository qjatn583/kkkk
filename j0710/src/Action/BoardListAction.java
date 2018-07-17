package Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.BoardBean;
import bean.PageInfo;
import Service.BoardListService;
import bean.ActionForward;

public class BoardListAction implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	ActionForward forward =null;
	BoardListService boardListService = new BoardListService();
	ArrayList<BoardBean> boardList = boardListService.getBoardList();
	//페이지 번호를 알기위해 사용하는 변수
	int page =1;
	//한 페이지에 보여줄 글 갯수를 정하기 위해 사용하는 변수
	int limit = 10;
	
	if(request.getParameter("page")!=null) {
		page=Integer.parseInt(request.getParameter("page"));
		
	}
	
	//전체 글 갯수를 가져오기 위한ListService클래스의 메소드 호출
	int listCount = boardListService.getListCount();
	//limit값을 걸어놓은 만큼 범위에 해당하는 글만 가져오는 방법
	ArrayList<BoardBean> boardList = boardListService.getBoardList(page,limit);
	//페이지 계산을 위한 부분
	//최대로 필요한 페이지 갯수 계산
	int maxPage = (int)((double)listCount/limit +1);
	//현재페이지에 보여줄 시작 페이지 번호
	int startPage =(((int)((double)page/10+0.9))-1)*10+1;
	
	int endPage =startPage +10-1;
	
	if(endPage>maxPage) {
		endPage = maxPage;
	}
	
	PageInfo pageInfo = new PageInfo();
	pageInfo.setPage(Page);
	pageInfo.setPage(startPage);
	pageInfo.setPage(endPage);
	pageInfo.setPage(maxPage);
	pageInfo.setPage(listCount);
	
	request.setAttribute("boardList",boardList);
	request.setAttribute("pageInfo",pageInfo);
	
	forward = new ActionForward();
	forward.setPath("/board/boardList.jsp");
	
	return forward;
}
}
