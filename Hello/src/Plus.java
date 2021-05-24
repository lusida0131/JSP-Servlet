//
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class Calc
// */
//@WebServlet("/Calc")
//public class Plus extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public Plus() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int num,num1,result;
//		
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		
//		num = Integer.parseInt(request.getParameter("first"));
//		num1 = Integer.parseInt(request.getParameter("sec"));
//		
//		result = calc(num, num1);
//		
//		out.println("<html>");
//		out.println("<head><title>두 수의 합</title></head>");
//		out.println("<body>");
//		out.println(num +" " + "+" + " " + num1 +" = " + result);
//		out.println("</body></html>");
//	}
//		public int calc(int num, int num1) {
//		int result = 0;
//		
//		result = num + num1;
//		
//		return result;
//		}
//}

