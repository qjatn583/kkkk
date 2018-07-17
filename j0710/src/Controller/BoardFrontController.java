package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Action.BoardListAction;
import Action.BoardModifyFormAction;
import Action.BoardModifyProAction;
import Action.BoardWriteAction;
import Action.boardDetailAction;
import Action.Action;
import bean.ActionForward;

@WebServlet("*.bo")

public class BoardFrontController extends HttpServlet{
	private static final long serialVersionUID = 1L;
    public BoardFrontController() {
        super();
    }
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());

		ActionForward forward=null;
		Action action=null;

		if(command.equals("/boardWritePro.bo")) {
			action = new BoardWriteAction();
			try {
				forward=action.execute(request,response);
			}catch(Exception e) {
				e.printStackTrace();
				}
			}else if(command.equals("/boardWriteForm.bo")) {
				forward = new ActionForward();
				forward.setPath("/board/boardWrite.jsp");		
			}else if(command.equals("/boardList.bo")) {
				action = new BoardListAction();
				try {
					forward=action.execute(request,response);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else if(command.equals("/boardDetail.bo")) {
				action = new boardDetailAction();
				try {
					forward=action.execute(request,response);
				}catch(Exception e) {
					e.printStackTrace();
					}
				}else if(command.equals("/boardModifyForm.bo")) {
					actoin = new BoardModifyFormAction();
					try {
						forward=action.execute(request,response);
					}catch(Exception e) {
						e.printStackTrace();
						}
				}else if(command.equals("/boardModifyForm.bo")) {
					actoin = new BoardModifyProAction();
					try {
						forward=action.execute(request,response);
					}catch(Exception e) {
						e.printStackTrace();
					}
					else if(command.equals("/boardFileDown.bo")) {
						action = new boardFileDownAction();
						try {
							forward=action.execute(request,response);
						}catch(Exception e) {
							e.printStackTrace();
							}
		if(forward!=null) {
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
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
