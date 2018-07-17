package Test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DispatcherServlet() {
        super();
    }

	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) {

		/*������(forwarding)���
		 * 1.Dispatcher���
		 * :�� ������� ������ �ϸ� �ּҰ� �ٲ��� �ʰ�
		 * :���� request������ ������
		 * 
		 * 2.Redirect���
		 * :�� ������� ������ �ϸ� �ּҰ� �ٲ�
		 * :request������ �������� ����
		 * 
		 * */
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//dispatcher��ü ����
		RequestDispatcher dispatcher = request.getRequestDispatcher("dispatcher.jsp");
		//request������request��� �Ӽ��� requestValue��� ���� ��Ƽ� ����
		request.setAttribute("request","requestValue");//request = requestValue
		//request,response�� �ִ� ������ ��� ��������
		//������ �ϰ��� �ϴ� �������� ������ ��ü����� ������ "dispatcher.jsp"����
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

}
