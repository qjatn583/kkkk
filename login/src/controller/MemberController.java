package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.MemberDeleteAction;
import action.MemberJoinAction;
import action.MemberListAction;
import action.MemberLoginAction;
import action.MemberViewAction;
import bean.ActionForward;

@WebServlet("*.me")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberController() {
        super();
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    
    	//주소값을 잘라내는 과정 
    	String RequestURI=request.getRequestURI();
    	//RequestURI = /jsp_example_180704/memberJoinAction.me
    	//RequestURI = /jsp_example_180704/memberLogin.me
    	//RequestURI = /jsp_example_180704/memberLoginAction.me
		String contextPath=request.getContextPath();
		//contextPath = /jsp_example_180704
		//contextPath = /jsp_example_180704
		String command=RequestURI.substring(contextPath.length());
		//command = /memberJoinAction.me
		//command = /memberLogin.me
		//command = /memberLoginAction.me
		
		//처리된 결과를 전송할 주소값 지정을 위한 클래스 
		ActionForward forward=null;
		//Controller로 부터 전달 받아 Service로 전달하기 위한 클래스 
		Action action=null;//action 변수 선언
    
		//command에 있는 주소값을 가지고 어떤 클래스를 호출할지 제어
		if(command.equals("/memberJoinAction.me")) {
			//MemberJoinAction 클래스에 대한 객체 생성 
			action = new MemberJoinAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/memberLoginAction.me")) {
			//MemberLoginAction 클래스 객체 생성 
			action = new MemberLoginAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/memberLogin.me")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./loginForm.jsp");
		} else if(command.equals("/memberJoin.me")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./joinForm.jsp");
		} else if(command.equals("/memberListAction.me")) {
			action = new MemberListAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/memberViewAction.me")) {
			action = new MemberViewAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/memberDeleteAction.me")) {
			action = new MemberDeleteAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//forward 객체를 판단하는 if문
		//forward 객체는 각각의 Action 클래스에서 넘겨준 
		//isRedirect, path 필드값을 가지고 있음. 
		if(forward != null) {
			//isRedirect 필드값을 가져오기 위한 getter 호출 
			if(forward.isRedirect()) {
				//redirect 필드값이 true로 세팅되어 있다면
				//redirect 메소드를 호출
				response.sendRedirect(forward.getPath());
				//회원가입을 예로들면.. 
				//response.sendRedirect("./memberLogin.me");
				//http://localhost:9090/프로젝트명/memberLogin.me
				//http://localhost:9090/프로젝트명/loginForm.jsp
			}else {
				//redirect 필드값이 false라면 
				//dispatcher 방식으로 이동 
				RequestDispatcher dispatcher = 
						request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
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
