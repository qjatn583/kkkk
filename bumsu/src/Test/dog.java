package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dog")
public class dog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public dog() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("text/html;charset=UTF-8");
		//서블릿에서 html을 사용하기 위해 out객체 선언
		PrintWriter out = response.getWriter();
		//dog.jsp(뷰페이지)로 부터 넘겨 받은 dog에 담긴 값을 가져옴
		
	    String[] dog = request.getParameterValues("dog1");
	    //선택된 강아지의 그림을 출력해주기 위한 html 코드작성
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body bgcolor='black'>");
		out.println("<table align='center'bgcolor='yellow>");
		out.println("<tr>");
		//dog에 담긴 값을 하나씩 접근해서 출력
		for(int i=0;i<dog.length;i++) {
			out.println("<td>");
			out.println("<img src'"+dog[i]+"'/>");
			//진돗개를 선택할 경우 <img scr="jin.jpg"/>
			out.println("</td>");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		/*out.println("푸들:"+dog+"<br>");
		out.println("진돗개:"+dog+"<br>");
		out.println("풍산개:"+dog+"<br>");
		out.println("삽살개:"+dog+"<br>");*/
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
