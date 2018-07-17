package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DirectURL")
public class DirectURL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DirectURL() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*name�� age��� �Ӽ����� �޾Ƽ� ����ϴ� ������ �ۼ��Ͻÿ�
		 * 1.name�� �޾ƿ���
		 * 2.�޾ƿ� ���� ������ ���
		 * 3.age�޾ƿ���
		 * 4.�޾ƿ� ���� ������ ���
		 * 5.������ �������� �������*/
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		response.setContentType("text/html);charset=UTF-8");
		System.out.println(name);
		System.out.println(age);
		
		PrintWriter out = response.getWriter();
		out.println("name��:"+name+"<br>");
		out.println("age��:"+age);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
