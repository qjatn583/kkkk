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
		//주소값을 잘라내는 과정
		String RequestURI=request.getRequestURI();
		//RequestURI= /jsp_example_180704/memberJoinAction.me
		String contextPath=request.getContextPath();
		//contextPath =/jsp_example_180704
		String command=RequestURI.substring(contextPath.length());
		//command=/memberJoinAction.me
		
		//처리된 결과를 전송할 주소값 지정을 위한 클래스
		ActionForward forward=null;
		//controller로 주터 전달받아 Service로 전달하기 위한 클래스
		Action action=null;
		
		//command에 들어있는 주소값을 가지고 어떤 클래스를 호출할지 제어
		if(command.equals("/memberJoinAction.me")) {
			//MemberJoinAction클래스에 대한 객체 생성
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
		//forward객체를 판단하는 if문
		//forward객체는 각각의 Action클래스에서 넘겨준 isPedirect,path필드값을 가지고있음
		if(forward!=null) {
			//isRedirect필드값을 가져오기 위한 getter호출
			if(forward.isRedirect()) {
				//redirect필드값이 true로 세팅되어있다면
				//redirect메소드를 호출
				response.sendRedirect(forward.getPath());
				//회원가입을 예로들면
				//response.sendRedirect("./memberLogin.me");
				//http://localhost:9090/프로젝트명/memberLogin.me
				
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
