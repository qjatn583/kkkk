package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.BoardDetailService;
import bean.ActionForward;
import bean.BoardBean;

public class BoardModifyFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		BoardDetailService boardDetailService = new BoardDetailService();
		BoardBean boardBean = boardDetailService.getArticle(boardNum);
		request.setAttribute("modifyView",boardBean);
		ActionForward forward = 
		return forward;
	}

}
