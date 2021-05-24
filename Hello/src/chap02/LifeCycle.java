package chap02;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	int initCount = 1;
	int doGetCount = 1;
	int destroyCount = 1;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() { // tomcat이 구동 되고, url로 호출이 되어야 시작이 됨
        super();		 // tomcat이 종료되지 않는한 계속 존재한다. -> init 메소드도 역시 같다.
        System.out.println("LifeCycle() called");
      
    }
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메소드는 처음 요청만 호출됨: " + initCount++);
	}

	@Override
	public void destroy() {  //application이 제거될 때 호출됨
		System.out.println("destroy 메소드는 톰캣이 종료될 때만 호출됨: " + destroyCount++);
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메소드가 요청될 때마다 호출됨 : " + doGetCount++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
