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
	//������ ��ȣ�� �˱����� ����ϴ� ����
	int page =1;
	//�� �������� ������ �� ������ ���ϱ� ���� ����ϴ� ����
	int limit = 10;
	
	if(request.getParameter("page")!=null) {
		page=Integer.parseInt(request.getParameter("page"));
		
	}
	
	//��ü �� ������ �������� ����ListServiceŬ������ �޼ҵ� ȣ��
	int listCount = boardListService.getListCount();
	//limit���� �ɾ���� ��ŭ ������ �ش��ϴ� �۸� �������� ���
	ArrayList<BoardBean> boardList = boardListService.getBoardList(page,limit);
	//������ ����� ���� �κ�
	//�ִ�� �ʿ��� ������ ���� ���
	int maxPage = (int)((double)listCount/limit +1);
	//������������ ������ ���� ������ ��ȣ
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
