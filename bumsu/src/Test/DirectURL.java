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
		/*name과 age라는 속성값을 받아서 출력하는 내용을 작성하시오
		 * 1.name을 받아오기
		 * 2.받아온 값을 변수에 담기
		 * 3.age받아오기
		 * 4.받아온 값을 변수에 담기
		 * 5.변수에 담은값을 각각출력*/
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		response.setContentType("text/html);charset=UTF-8");
		System.out.println(name);
		System.out.println(age);
		
		PrintWriter out = response.getWriter();
		out.println("name값:"+name+"<br>");
		out.println("age값:"+age);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
