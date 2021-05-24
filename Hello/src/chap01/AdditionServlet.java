package chap01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AdditionServlet
 * 서블릿을 만드는 방법 : @어노테이션을 사용하는 방법, Web.xml에서 설정하는 방법
 * 1.@WebServlet 어노테이션을 사용 (최근방식)
 * 		이클립스에서 New -> Servlet 추가메뉴를 이용하면 url 설정할 수 있다.
 * 		서블릿을 만들 수 있음.
 * 2.Web.xml을 이용하는 방법
 * 		HttpServlet 클래스를 상속받은 Servlet class 생성
 * 		서블릿 및 url 매핑을 Web.xml에 정의해준다.
 */
@WebServlet("/AdditionServlet") //-> "/Hello/Additionservlet"
public class AdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
		response.setContentType("text/html; charset=UTF-8"); //브라우저로 출력하는 데이터를 한글처리
		PrintWriter out = response.getWriter(); //브라우저로 전송할 내용을 출력
	 
		out.println("<html><head><title>두 수의 합</title></head>");
		out.println("<body>");
		out.println(num1 + "+" + num2 + "=" + add);
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
