package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RadioServelt")
public class test03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public test03() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String[] gender = request.getParameterValues("gender");
		String[] chkmail = request.getParameterValues("chkmail");
		String[] content = request.getParameterValues("contents");
	
		
		out.print("<html><body>");
		out.println("당신이 입력한 정보입니다.<hr>");
		out.println("성별 :<b>");
		out.println(gender);
		out.println("</b><br>메일정보수신여부:<b>");
		out.println(chkmail);
		out.println("</b><br>가입인사:<b><pre>");
		out.println(content);
		//뒤로가기링크
		out.println("</b></pre><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</html></body>");
				 
				
				
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
