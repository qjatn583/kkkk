package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectServlet")
public class test04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public test04() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job = request.getParameter("job");
		String[] interest = request.getParameterValues("interest");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.println("당신이 입력한 직업:");
		out.println("성별 :<b>");
		out.println(job);
		out.println("<hr>당신이 선택한 관심분야:");
		if(interest==null) {
			out.println("선택한 항목이 없습니다.");
		}else {
			for(String interests:interest) {
				out.print(interests+"");
			}
		}
		out.println("</b></pre><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</html></body>");
		
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
