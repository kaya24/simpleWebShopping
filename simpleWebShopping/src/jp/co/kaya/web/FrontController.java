package jp.co.kaya.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet(name = "FrontCont", urlPatterns = { "/FrontCont" })
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String page = null;

		req.setCharacterEncoding("UTF-8");
		String buttonid = req.getParameter("BUTTON_ID");

		ActionInterface action = null;
		if( buttonid == null ){
			buttonid = "TOP";
		}

		switch(buttonid){
		case "TOP":
			action = new TopAction();
			page = action.execute(req);
			break;
		case "DETAIL":
			action = new DetailAction();
			page = action.execute(req);
			break;
		case "BACK":
			action = new BackAction();
			page = action.execute(req);

		case "NEWACCOUNT":
			break;
		}

		RequestDispatcher rd = req.getRequestDispatcher("/jsp" + page);
		rd.forward(req, res);
	}

}
