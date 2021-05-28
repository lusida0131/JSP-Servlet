

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
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/memberUpdate.do")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "chap09/memberUpdateForm.jsp";
		HttpSession session	= request.getSession();
		MemberVO member = (MemberVO) session.getAttribute("loginUser");
		if(member == null) {
			url = "chap09/loginForm.jsp";
			request.setAttribute("message", "로그인 먼저 하세요");
		} else {
			String useid = request.getParameter("useid");
			if (member.getUseid().equals(useid)){
				MemberDAO mDao = MemberDAO.getInstance();
				MemberVO mVo = mDao.getMember(useid);
				request.setAttribute("mVo", mVo);
			} else {
				url = "chap09/loginForm.jsp";
				request.setAttribute("message", "잘못된 요청입니다.");
			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("chap09/memberUpdateForm.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String useid = request.getParameter("useid");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String grade = request.getParameter("grade");
		
		String url = "chap09/loginForm.jsp";
		HttpSession session = request.getSession();
		MemberVO member = (MemberVO) session.getAttribute("loginUser");
		if(member == null) {
			url = "/chap09/loginForm.jsp";
			request.setAttribute("message", "로그인을 먼저 하세요");
		} else {
			if(member.getUseid().equals(useid)) {
				MemberVO mVo = new MemberVO();
				mVo.setUseid(useid);
				mVo.setPwd(pwd);
				mVo.setEmail(email);
				mVo.setPhone(phone);
				mVo.setGrade(Integer.parseInt(grade));
				MemberDAO mDao = MemberDAO.getInstance();
				mDao.updateMember(mVo);
				response.sendRedirect("login.do");
			}
		}
	}

}
