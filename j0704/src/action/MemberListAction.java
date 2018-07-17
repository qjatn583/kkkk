package action;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ActionForward;
import bean.MemberBean;
import service.MemberJoinService;
import service.MemberListService;

public class MemberListAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	//세션영역에 있는 id 불러옴
		HttpSession session =request.getSession();
		String id= (String)session.getAttribute("id");
		ActionForward forward = null;
		
		if(id==null){
		forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("./memberLogin.me");
		}
		else if(!id.equals("admin")) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<scruipt>");
			out.println("alert('관리자가아닙니다.')");
			out.println("location.href='./memberLogin.me'</script>");
		}
		else {
			forward = new ActionForward();
			MemberListService memberListService = new MemberListService();
			ArrayList<MemberBean> memberList = 
					memberListService.getMemberList();
			
			request.setAttribute("memberList",memberList);
			forward.setPath("./member_list.jsp");
		}
				
			return forward;
	
		/*MemberBean member = new MemberBean();
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
	
		MemberJoinService memberJoinService = new MemberJoinService();
		
		boolean loginResult = memberLoginService.login(member);
	
		return null;
	}
	if(id=null){
		ActionForward forward = new ActionForward();
		HttpServletRequest request;
		HttpSession session =request.getSession();
		HttpSession member;
		session.setAttribute("id", member.getId());
		forward.setRedirect(true);
		forward.setPath("./memberListAction.me");*/
		
}
}

