package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/boardList")
public class boardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public boardList() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		String a = request.getParameter("cam");
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out = response.getWriter();
	out.println("BoardList.jsp에서 넘어온값:"+page);
	out.println("BoardList.jsp에서 넘어온값:"+a);
	System.out.println(page);
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
