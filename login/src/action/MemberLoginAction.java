package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ActionForward;
import bean.MemberBean;
import service.MemberLoginService;

public class MemberLoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberBean member = new MemberBean();
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));

		MemberLoginService memberLoginService = new MemberLoginService();
		boolean loginResult = memberLoginService.login(member);
		
		ActionForward forward = null;
		//로그인 성공, 실패 여부 판단 
		if(loginResult) {
			forward = new ActionForward();
			/*
			 * 1. 세션에 id를 저장 
			 * 2. 주소값 변경을 위해 redirect 값을 true로
			 * 3. 목적지를 memberListAction.me
			 */
			HttpSession session = request.getSession();
			session.setAttribute("id", member.getId());
			forward.setRedirect(true);
			forward.setPath("./memberListAction.me");
		} else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('로그인 실패')");
			out.println("location.href='./memberLogin.me'</script>");
		}
		
		return forward;
		
	}

}











