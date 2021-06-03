package board.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.BoardVO;
import common.command.CommandHandler;

public class BoardWriteHandler implements CommandHandler {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return "/board/boardWrite.jsp";
		}
		else if(req.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(req, res);
		}
		else {
			res.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
	}

	private String processSubmit(HttpServletRequest req, HttpServletResponse res) throws IOException {
		BoardVO bVo = new BoardVO();
		bVo.setName(req.getParameter("name"));
		bVo.setPass(req.getParameter("pass"));
		bVo.setEmail(req.getParameter("email"));
		bVo.setTitle(req.getParameter("title"));
		bVo.setContent(req.getParameter("content"));
		BoardDAO bDao = BoardDAO.getInstance();
		bDao.insertBoard(bVo);
		res.sendRedirect("list.do");
		return null;
	}
}