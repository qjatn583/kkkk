package action;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ActionForward;
import bean.MemberBean;
import service.MemberListService;
import service.MemberViewService;

public class MemberViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//로그인여부확인
		//로그인한 id가 admin인지 확인
		//따라서 admin으로 로그인 했을때만 상세보기를 할 수 있게
		
		
		HttpSession session =request.getSession();
		String id= (String)session.getAttribute("id");//세션에 있는 id를 가져온다
		ActionForward forward = null;//forward객체를 널값으로 만들어서
		
		if(id==null){//id가 널이라면
		forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("./memberLogin.me");
		}
		else if(!id.equals("admin")) {//로그인이 돼있는데 admin이 아니라면
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<scruipt>");
			out.println("alert('관리자가아닙니다.')");
			out.println("location.href='./memberLogin.me'</script>");
		}
		else {
			forward = new ActionForward();//ActionForward메소드 forward객체 생성
			//memberViewAction.me?id=AA
			//memberViewAction.me이 요청될때 id에 담겨온 값을 가져옴.
			String viewId = request.getParameter("id");
			MemberViewService memberViewService = new MemberViewService();
			MemberBean member=memberViewService.getMember(viewId);
			request.setAttribute("member",member);//request에("member",member)를 담는다
			forward.setPath("./member_info.jsp");
			
			

			
	
		}
				
			return forward;
		
		
		
		return null;
	}

}
