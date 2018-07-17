package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ActionForward;
import bean.MemberBean;
import service.MemberJoinService;
import service.MemberLoginService;

public class MemberLoginAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		MemberBean member = new MemberBean();
		/*String id =request.getParameter("id");
		String password =request.getParameter("password");*/
		
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		

		
		MemberJoinService memberJoinService = new MemberJoinService();
		
		boolean loginResult = MemberLoginService.login(member);
		ActionForward forward = null;
		//LoginResult = memberJoinService.joinMember(member);
		
		
		if(loginResult){
			forward = new ActionForward();
			HttpSession session =request.getSession();
			session.setAttribute("id", member.getId());
			forward.setRedirect(true);
			forward.setPath("./memberListAction.me");
			
			/*response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('로그인 실패')");
			out.println("history.back()</script>");*/
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('로그인 실패')");
			out.println("location.href='./memberLogin.me'</script>");
			
			
			
			
			/*forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./memberLogin.me");*/
		}
		
		
		return forward;
	}

}
