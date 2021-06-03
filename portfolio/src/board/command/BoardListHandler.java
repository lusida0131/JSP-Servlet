package board.command;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.BoardVO;
import board.vo.Paging;
import common.command.CommandHandler;

public class BoardListHandler implements CommandHandler{
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return processForm(req, res);
		}
		
		else {
			res.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
	}

	private String processForm(HttpServletRequest req, HttpServletResponse res) throws SQLException {
		String url = "/board/boardList.jsp";
//		int page = 1;
//		if(req.getParameter("page") != null) {
//			page = Integer.parseInt(req.getParameter("page"));
//		}
//		BoardDAO bDao = BoardDAO.getInstance();
//		Paging paging = new Paging();
//		paging.setPage(page);
//		int count = bDao.getAllCount();
//		paging.setTotalCount(count);
//		paging.setPage(page);
//		
//		List<BoardVO> boardList = bDao.selectAllBoards(paging);
//		req.setAttribute("boardList", boardList);
//		req.setAttribute("paging", paging);
//		return url;
		BoardDAO dao = BoardDAO.getInstance();
	    int page = 1;
	     
	        if(req.getParameter("page")!=null){
	            page = Integer.parseInt(req.getParameter("page"));
	        }
	        Paging paging = new Paging();
	        
	        int count = dao.getAllCount();
//	        paging.setTotalCount(count);
	        paging.setPage(page);
	        paging.setTotalCount(count);

	        
	        List<BoardVO> list = dao.selectAllBoards(page);
	        req.setAttribute("boardList", list);
	        req.setAttribute("paging", paging);
	        
	      return url;
	   
	}
}