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

		/*포워딩(forwarding)방식
		 * 1.Dispatcher방식
		 * :이 방식으로 포워딩 하면 주소가 바뀌지 않고
		 * :같은 request영역을 공유함
		 * 
		 * 2.Redirect방식
		 * :이 방식으로 포워딩 하면 주소가 바뀜
		 * :request영역이 공유되지 않음
		 * 
		 * */
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//dispatcher객체 선언
		RequestDispatcher dispatcher = request.getRequestDispatcher("dispatcher.jsp");
		//request영역에request라는 속성에 requestValue라는 값을 담아서 전달
		request.setAttribute("request","requestValue");//request = requestValue
		//request,response에 있는 내용을 모두 포워딩함
		//포워딩 하고자 하는 목적지는 위에서 객체선언시 적어준 "dispatcher.jsp"파일
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

}
