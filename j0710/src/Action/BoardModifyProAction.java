package Action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.BoardDetailService;
import bean.ActionForward;
import bean.BoardBean;

public class BoardModifyProAction implements Action{


		
		@Override
		public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			BoardBean boardBean = new BoardBean();
			BoardModifyProService boardModifyProService = new BoardModifyProService();
			//��й�ȣȮ��
			
			boolean isPassRight = boardModifyProService.isArticlePass(boardNum,boardPass);
			
			if(isPassRight) {
				boardBean.setBOARD_NUM(boardNum);
				boardBean.setBOARD_SUBJECT(request.getParameter("BOARD_SUBJECT"));
				boardBean.setBOARD_CONTENT(request.getParameter("BOAR_CONTENT"));
				isModifySuccess = boardModifyProService.modifyArticle(boardBean);
				
				if(isModifySuccess) {
					forward = new ActionForward();
					forward.setRedirect(true);
					forward.setPath("boardDetail.bo?boardNum="+boardBean.getBOARD_NUM());
				}else {
					response.setContentType("text/html;charset=UTF-8");
					PrintWriter out = response.getWriter();
					out.println("<script>");
					out.println("alert('���� ����')");
					out.println("history.back();");
					out.println("</script>");
				}
				return forward;
				
			}else {
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('��й�ȣ�� Ʋ���ϴ�.')");
				out.println("history.back();");
				out.println("</script>");
			}
			return forward;
				

}
