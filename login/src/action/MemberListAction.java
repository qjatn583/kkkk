package action;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ActionForward;
import bean.MemberBean;
import service.MemberListService;

public class MemberListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//세션영역에 있는 id 불러옴
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		ActionForward forward = null;
		//id가 null이면 로그인 페이지로 이동 
		if(id==null) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./memberLogin.me");
		}
		//id가 admin이 아니면 alert을 띄우고 로그인 페이지로 이동 
		else if(!id.equals("admin")) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('관리자가 아닙니다.')");
			out.println("location.href='./memberLogin.me'</script>");
		}
		//로그인한 아이디가 admin인 경우 
		else {
			forward = new ActionForward();
			MemberListService memberListService = new MemberListService();
			//호출 결과를 List 형태로 받아옴. 
			ArrayList<MemberBean> memberList = 
					memberListService.getMemberList();
			//request영역에 호출결과를 저장 
			request.setAttribute("memberList", memberList);
			forward.setPath("./member_list.jsp");
		}
		
		return forward;
	}
	
}










