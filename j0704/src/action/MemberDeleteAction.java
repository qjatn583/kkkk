package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ActionForward;
import service.MemberDeleteService;

public class MemberDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String delId = request.getParameter("id");
		MemberDeleteService memberDeleteService = 
				new MemberDeleteService();
		boolean deleteResult = 
				memberDeleteService.deleteMember(delId);
		
		if(deleteResult) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./memberListAction.me");
		
		
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('회원가입 실패')");
			out.println("history.back()</script>");			
		}
		return null;
	}


}
