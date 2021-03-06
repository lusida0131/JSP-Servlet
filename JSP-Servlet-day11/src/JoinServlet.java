

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dto.MemberVO;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("chap10/joinForm.jsp");
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String useid = request.getParameter("useid");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String grade = request.getParameter("grade");
		MemberVO mVo = new MemberVO();
		mVo.setName(name);
		mVo.setUseid(useid);
		mVo.setPwd(pwd);
		mVo.setEmail(email);
		mVo.setPhone(phone);
		mVo.setGrade(Integer.parseInt(grade));
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.insertMember(mVo);
		HttpSession session = request.getSession();
		if(result == 1) {
			session.setAttribute("useid", mVo.getUseid());
			request.setAttribute("message", "회원가입에 성공했습니다");
		} else
			request.setAttribute("message", "회원가입에 실패했습니다");
		RequestDispatcher dispatcher = request.getRequestDispatcher("chap10/loginForm.jsp");
		dispatcher.forward(request, response);
	}

}
