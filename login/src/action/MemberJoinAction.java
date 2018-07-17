package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ActionForward;
import bean.MemberBean;
import service.MemberJoinService;

public class MemberJoinAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * 1. Controller로 부터 전달받은 내용을 DB에 전송할 수 있도록 준비
		 * 2. request영역으로 부터 값을 받아와서 Bean 타입으로 세팅 
		 * 3. Service 클래스로 Bean 타입의 객체를 전달. 
		 * 4. Service 클래스로 부터 처리된 결과를 넘겨 받아 성공, 실패 여부 판단
		 * 5. 성공하면 로그인 페이지로 넘기고, 실패하면 실패 메시지를 띄움. 
		 * 6. 결과를 Controller에게 리턴 
		 */
		
		//MemberBean 객체를 만들어서 필드값 세팅 
		MemberBean member = new MemberBean();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		member.setId(id);
		//member.setId(request.getParameter("id"));
		member.setPassword(password);
		member.setName(name);
		member.setAge(age);
		member.setGender(gender);
		member.setEmail(email);
		
		//MemberJoinService 클래스 호출 
		boolean joinResult = false;
		
		MemberJoinService memberJoinService = new MemberJoinService();
		joinResult = memberJoinService.joinMember(member);
		
		//성공, 실패 여부를 판단 
		ActionForward forward = null;
		if(joinResult==false) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('회원가입 실패')");
			out.println("history.back()</script>");
		} else {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./memberLogin.me");
		}
		return forward;
	}
	
}











