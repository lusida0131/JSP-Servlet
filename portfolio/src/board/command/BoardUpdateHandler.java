package board.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.BoardVO;
import common.command.CommandHandler;

public class BoardUpdateHandler implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return processForm(req, res);
		}
		else if(req.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(req, res);
		}
		else {
			res.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
	}

	private String processForm(HttpServletRequest req, HttpServletResponse res) {
		String url = "/board/boardUpdate.jsp";
		String num = req.getParameter("num");
		BoardDAO bDao = BoardDAO.getInstance();
		bDao.updateReadCount(num);
		BoardVO bVo = bDao.selectOneBoardByNum(num);
		req.setAttribute("board", bVo);
		return url;
	}

	private String processSubmit(HttpServletRequest req, HttpServletResponse res) throws IOException {
		BoardVO bVo = new BoardVO();
		bVo.setNum(Integer.parseInt(req.getParameter("num")));
		bVo.setName(req.getParameter("name"));
		bVo.setPass(req.getParameter("pass"));
		bVo.setEmail(req.getParameter("email"));
		bVo.setTitle(req.getParameter("title"));
		bVo.setContent(req.getParameter("content"));
		BoardDAO bDao = BoardDAO.getInstance();
		bDao.updateBoard(bVo);
		res.sendRedirect("list.do");
		return null;
	}
}
