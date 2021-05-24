

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class form
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>더하는 수 입력 폼</title></head>");
		out.println("<body>");
		out.println("<form method='post' action=' " + request.getContextPath() + "/AddServlet'>");
		out.println("<label for='first'>수 &nbsp; 1 : </label>");
		out.println("<input type='text' id='first' name='first'><br>");
		out.println("<label for='sec'>수 &nbsp; 2 : </label>");
		out.println("<input type='text' id='sec' name='sec'><br>");
		out.println("<input type='submit'value='더하기'>");
		out.println("</form");
		out.println("</body");
		out.println("</html");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num,num1,result;
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		num = Integer.parseInt(request.getParameter("first"));
		num1 = Integer.parseInt(request.getParameter("sec"));
		
		result = calc(num, num1);
		
		out.println("<html>");
		out.println("<head><title>두 수의 합</title></head>");
		out.println("<body>");
		out.println(num +" " + "+" + " " + num1 +" = " + result);
		out.println("</body></html>");
	}
		public int calc(int num, int num1) {
		int result = 0;
		
		result = num + num1;
		
		return result;
		}

}
