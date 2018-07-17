package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.BoardDetailService;
import bean.ActionForward;
import bean.BoardBean;

public class boardDetailAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	int boardNum = Integer.parseInt(request.getParameter("boardNum"));
	
	String page =request.getParameter("page");
	
	
	BoardDetailService boardDetailService= new BoardDetailService();
	BoardBean boardview = boardDetailService.getArticle(boardNum);
	
	ActionForward forward = new ActionForward();
	request.setAttribute("page", page);
	request.setAttribute("boardview", boardview);
	
	
	forward.setPath("/board/boardview.jsp");
		return forward;
	}

}
