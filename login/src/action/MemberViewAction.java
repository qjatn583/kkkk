package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ActionForward;
import bean.MemberBean;
import service.MemberViewService;

public class MemberViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//로그인 여부 확인
		//로그인한 id가 admin인지 확인 
		//따라서 admin으로 로그인 했을 때만 상세보기를 할 수 있게 
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		ActionForward forward = null;
		
		if(id==null) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./memberLogin.me");
		} else if(!id.equals("admin")) {
			response.setContentType("text/html;charset=UTF-8");
	   		PrintWriter out=response.getWriter();
	   		out.println("<script>");
	   		out.println("alert('관리자가 아닙니다.');");
	   		out.println("location.href='./memberLogin.me';");
	   		out.println("</script>");
		} else {
			forward = new ActionForward();
			//memberViewAction.me?id=AA
			//memberViewAction.me이 요청될 때 id에 담겨온 값을 가져옴. 
			String viewId = request.getParameter("id");
			MemberViewService memberViewService = 
					new MemberViewService();
			MemberBean member = 
					memberViewService.getMember(viewId);
			
			request.setAttribute("member", member);
			forward.setPath("./member_info.jsp");
		}
		return forward;
	}

}











