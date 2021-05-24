package chap01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginPro")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("doGet() 호출됨.");
	      //아이디와 비밀번호를 출력
	      
	      PrintWriter out = response.getWriter();
	      String id = request.getParameter("id");   //브라우저로부터 올라온 네임을 가져온다.
	      String pw = request.getParameter("pw");	//브라우저로부터 올라온 네임을 가져온다.
	      String pws = request.getParameter("pw");	//브라우저로부터 올라온 네임을 가져온다.
	      out.println("<p>id:"+id+"<p>");
	      out.println("<p>pw:"+pw+"<p>");
	      out.println("<p>pw:"+pws+"<p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPsot() 호출됨");
		doGet(request, response);
	}
}
