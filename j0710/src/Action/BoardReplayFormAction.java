package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.BoardDetailService;
import bean.ActionForward;
import bean.BoardBean;

public class BoardReplayFormAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int boardNum = Integer.parseInt(request.getParameter(0));
		BoardDetailService boardDetailService = 
				new BoardDetailService();
		
		BoardBean boardBean = boardDetailService.getArticle();
		request.setAttribute("article", boardBean);
		ActionForward forward = new ActionForward();
		forward.setPath("/board/boardReply.jsp");
		return null;
	}

}
