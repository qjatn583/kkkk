package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class member extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public member() {
        super();
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setCharacterEncoding("text/html;charset=UTF-8");
	
    String name = request.getParameter("name");
	String address = request.getParameter("address");
	String tel = request.getParameter("tel");
	String hobby = request.getParameter("hobby");
	
	response.setContentType("text/html;charset=UTF-8");
	
	PrintWriter out = response.getWriter();
	out.println("�Է����̸�:"+name+"<br>");
	out.println("�Է����ּ�:"+address+"<br>");
	out.println("�Է��� ��ȣ:"+tel+"<br>");
	out.println("�Է������:"+hobby+"<br>");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
}

}
