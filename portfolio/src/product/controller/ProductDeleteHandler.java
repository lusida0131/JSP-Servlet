package product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.command.CommandHandler;
import product.dao.ProductDAO;
import product.dto.ProductVO;

public class ProductDeleteHandler implements CommandHandler {
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getMethod().equalsIgnoreCase("GET")) {
			return processForm(request, response);
		}
		else if(request.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(request, response);
		}
		else {
			response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
	}
	private String processSubmit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		Integer code = Integer.valueOf(request.getParameter("code"));
		ProductDAO pDao = ProductDAO.getInstance();
		pDao.deleteProduct(code);
		response.sendRedirect("list.do");
		return null;
	}
	private String processForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/product/productDelete.jsp";
		Integer code = Integer.valueOf(request.getParameter("code"));
		ProductDAO pDao = ProductDAO.getInstance();
		ProductVO pVo = pDao.selectProductByCode(code);
		request.setAttribute("product", pVo);
		return url;
	}
}
