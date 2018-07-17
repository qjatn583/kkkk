package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ActionForward;
import bean.MemberBean;
import service.MemberJoinService;

public class MemberJoinAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    
	      /*1.Controller�� ���� ���޹��� ������ DB�� ������ �� �ֵ��� �غ�
	      2.request�������� ���� ���� �޾ƿͼ� Bean Ÿ������ ����
	      3.Service Ŭ������ BeanŸ���� ��ü�� ����.
	      4.Service Ŭ������ ���� ó���� ����� �Ѱ� ���޹޾� ����,���п��θ� �Ǵ�
	      5.�����ϸ� �α��� �������� �ѱ��, �����ϸ� ���и޼����� ���.
	      6.����� Controller���� ����*/
	         
		
		//MemberBean��ü�� ���� �ʵ尪 ����
		MemberBean member = new MemberBean();
		String id =request.getParameter("id");
		String password =request.getParameter("password");
		String name =request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender =request.getParameter("gender");
		String email =request.getParameter("email");
		
		
		
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setAge(age);
		member.setGender(gender);
		member.setEmail(email);
		
		boolean joinResult = false;
		MemberJoinService memberJoinService = new MemberJoinService();
		joinResult = memberJoinService.joinMember(member);
		
		ActionForward forward = null;
		if(joinResult==false){
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('ȸ������ ����')");
			out.println("history.back()</script>");
		}else {
			System.out.println("�˻� joinaction 1");
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./memberLogin.me");
		}
		
		
		return null;
	}

}
