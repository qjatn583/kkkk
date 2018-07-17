package Test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/joinSerVelt")
public class s061802 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public s061802() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//이메일 입력값 처리
		String email =  request.getParameter("email");
		if(request.getParameter("email_dns").trim()=="") {
			email+="@"+request.getParameter("emailadder");
		}else {
			email+="@"+ request.getParameter("email_dns");
		}
		out.println("입력한 이메일:");
		out.print(email);
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
