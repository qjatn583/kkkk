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
		//�α��ο���Ȯ��
		//�α����� id�� admin���� Ȯ��
		//���� admin���� �α��� �������� �󼼺��⸦ �� �� �ְ�
		
		
		HttpSession session =request.getSession();
		String id= (String)session.getAttribute("id");//���ǿ� �ִ� id�� �����´�
		ActionForward forward = null;//forward��ü�� �ΰ����� ����
		
		if(id==null){//id�� ���̶��
		forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("./memberLogin.me");
		}
		else if(!id.equals("admin")) {//�α����� ���ִµ� admin�� �ƴ϶��
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<scruipt>");
			out.println("alert('�����ڰ��ƴմϴ�.')");
			out.println("location.href='./memberLogin.me'</script>");
		}
		else {
			forward = new ActionForward();//ActionForward�޼ҵ� forward��ü ����
			//memberViewAction.me?id=AA
			//memberViewAction.me�� ��û�ɶ� id�� ��ܿ� ���� ������.
			String viewId = request.getParameter("id");
			MemberViewService memberViewService = new MemberViewService();
			MemberBean member=memberViewService.getMember(viewId);
			request.setAttribute("member",member);//request��("member",member)�� ��´�
			forward.setPath("./member_info.jsp");
			
			

			
	
		}
				
			return forward;
		
		
		
		return null;
	}

}
