package jp.co.kaya.web;

import javax.servlet.http.HttpServletRequest;

import jp.co.kaya.entity.Item;
import jp.co.kaya.logic.TopLogic;

public class DetailAction implements ActionInterface {

	public String execute(HttpServletRequest req) {
		String page = "/detail.jsp";

		try {
			req.setCharacterEncoding("UTF-8");

			String item_id = req.getParameter("item_id");
			//String item_id = (String)req.getAttribute("item_id");

			TopLogic logic = new TopLogic();
			Item item = null;

			item = logic.getItemLogic(item_id);
			req.setAttribute("item", item);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return page;
	}

}
