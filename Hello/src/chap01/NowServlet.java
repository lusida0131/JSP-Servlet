package chap01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 서블릿 추가하면 톰캣을 다시 구동해야 된다. -> compile을 하기 때문에 다시 구동을 해야 하고
//jsp를 추가하거나 변경하면 톰캣을 다시 구동하지 않아도 된다. ->interpreter 방식으로 해서 구동 안해도된다.
public class NowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; //NowServlet 클래스를 식별하는 식별자
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8"); //한글처리
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>현재시간 출력</title></head>");
		out.println("<body>");
		out.println("현재 시간은");
		out.println(new Date()); //default 시간 형식으로 출력
		out.println(" 입니다.");
		out.println("</body>");
		out.println("</html>");
	
	}
 }
