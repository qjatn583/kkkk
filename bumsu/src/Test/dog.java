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
		//�������� html�� ����ϱ� ���� out��ü ����
		PrintWriter out = response.getWriter();
		//dog.jsp(��������)�� ���� �Ѱ� ���� dog�� ��� ���� ������
		
	    String[] dog = request.getParameterValues("dog1");
	    //���õ� �������� �׸��� ������ֱ� ���� html �ڵ��ۼ�
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body bgcolor='black'>");
		out.println("<table align='center'bgcolor='yellow>");
		out.println("<tr>");
		//dog�� ��� ���� �ϳ��� �����ؼ� ���
		for(int i=0;i<dog.length;i++) {
			out.println("<td>");
			out.println("<img src'"+dog[i]+"'/>");
			//�������� ������ ��� <img scr="jin.jpg"/>
			out.println("</td>");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		/*out.println("Ǫ��:"+dog+"<br>");
		out.println("������:"+dog+"<br>");
		out.println("ǳ�갳:"+dog+"<br>");
		out.println("��찳:"+dog+"<br>");*/
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
