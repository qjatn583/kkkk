package Action;

import java.io.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import Service.BoardWriteService;
import bean.ActionForward;
import bean.BoardBean;


public class BoardWriteAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String realPath="";
		String savePath="/boardUpload";
		
		int size = 5*1024*1024;
		ServletContext context = request.getServletContext();
		realPath = context.getRealPath(savePath);
	
		MultipartRequest multi = new MultipartRequest (request, realPath, size, "UTF-8", new DefaultFileRenamePolicy());
		
		BoardBean boardBean = new BoardBean();
		
		boardBean.setBOARD_NAME(multi.getParameter("BOARD_NAME"));
		boardBean.setBOARD_PASS(multi.getParameter("BOARD_PASS"));
		boardBean.setBOARD_SUBJECT(multi.getParameter("BOARD_SUBJECT"));
		boardBean.setBOARD_CONTENT(multi.getParameter("BOARD_CONTENT"));
		boardBean.setBOARD_FILE(multi.getOriginalFileName((String)multi.getFileNames().nextElement()));
		
		
		System.out.println(multi.getParameter("BOARD_NAME"));
		BoardWriteService boardWriteService = new BoardWriteService();
		
		boolean WriteResult = boardWriteService.registArticle(boardBean);
	
		ActionForward forward = null;
		
		if(WriteResult){
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("boardList.bo");
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('등록 실패')");
			out.println("history.back();");
			out.println("</script>");
		}
		return forward;
			
			
		}
		/*int num =Integer.parseInt(request.getParameter("num"));
		String name =request.getParameter("name");
		String pass =request.getParameter("pass");
		String subject =request.getParameter("subject");
		String content =request.getParameter("content");
		String file =request.getParameter("file");
		String re_ref =request.getParameter("re_ref");
		String re_lev =request.getParameter("re_lev");
		String re_seq =request.getParameter("re_seq");
		String readcount =request.getParameter("readcount");
		int date =Integer.parseInt(request.getParameter("date"));

		board.setNum(num);
		board.setName(name);
		board.setPass(pass);
		board.setSubject(subject);
		board.setContent(content);
		board.setFile(file);
		board.setRe_ref(re_ref);
		board.setFile(re_lev);
		board.setRe_seq(re_seq);
		board.setReadcount(readcount);
		board.setDate(date);
		
		boolean joinResult = false;
		BoradWriteService boradWriteService = new BoradWriteService();
		joinResult = boradWriteService.joinboard(board);
		
		ActionForward forward = null;
		if(joinResult==false){
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('회원가입 실패')");
			out.println("history.back()</script>");
		}else {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./memberLogin.me");
		}
		
		
		return null;
		*/
}
