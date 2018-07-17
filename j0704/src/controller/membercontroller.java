package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.MemberJoinAction;
import action.MemberListAction;
import action.MemberLoginAction;
import action.MemberViewAction;
import bean.ActionForward;


@WebServlet("*.me")
public class membercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public membercontroller() {
        super();
    }

	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ּҰ��� �߶󳻴� ����
		String RequestURI=request.getRequestURI();
		//RequestURI= /jsp_example_180704/memberJoinAction.me
		String contextPath=request.getContextPath();
		//contextPath =/jsp_example_180704
		String command=RequestURI.substring(contextPath.length());
		//command=/memberJoinAction.me
		
		//ó���� ����� ������ �ּҰ� ������ ���� Ŭ����
		ActionForward forward=null;
		//controller�� ���� ���޹޾� Service�� �����ϱ� ���� Ŭ����
		Action action=null;
		
		//command�� ����ִ� �ּҰ��� ������ � Ŭ������ ȣ������ ����
		if(command.equals("/memberJoinAction.me")) {
			//MemberJoinActionŬ������ ���� ��ü ����
			action= new MemberJoinAction();
		try {
			forward=action.execute(request,response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}else if (command.equals("/memberLoginAction.me")) {
		action = new MemberLoginAction();
		try {
		forward = action.execute(request, response);	
		}catch(Exception e) {
			e.printStackTrace();
		}}else if(command.equals("/memberLogin.me")) {
		forward=new ActionForward();
		forward.setRedirect(true);
		forward.setPath("./LoginForm.jsp");
	}else if(command.equals("/memberLogin.me")) {
		forward=new ActionForward();
		forward.setRedirect(true);
		forward.setPath("./JoinForm.jsp");
	}else if(command.equals("/memberListAction.me")) {
		action = new MemberListAction();
		try {
			forward = action.execute(request, response);
		}catch(Exception e) {
			e.printStackTrace();
	}
	}else if(command.equals("/memberViewAction.me")) {
		action = new MemberViewAction();
	}
		//forward��ü�� �Ǵ��ϴ� if��
		//forward��ü�� ������ ActionŬ�������� �Ѱ��� isPedirect,path�ʵ尪�� ����������
		if(forward!=null) {
			//isRedirect�ʵ尪�� �������� ���� getterȣ��
			if(forward.isRedirect()) {
				//redirect�ʵ尪�� true�� ���õǾ��ִٸ�
				//redirect�޼ҵ带 ȣ��
				response.sendRedirect(forward.getPath());
				//ȸ�������� ���ε��
				//response.sendRedirect("./memberLogin.me");
				//http://localhost:9090/������Ʈ��/memberLogin.me
				
			}else {
				RequestDispatcher dispatcher = 
						request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request,response);
			}
				
			}
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	doProcess(request, response);
		}
		
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

}
