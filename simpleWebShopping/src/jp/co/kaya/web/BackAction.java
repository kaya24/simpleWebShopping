package jp.co.kaya.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import jp.co.kaya.entity.Item;
import jp.co.kaya.logic.TopLogic;

public class BackAction implements ActionInterface{

	public String execute(HttpServletRequest req){
		String page = "/index.jsp";

		try{
		req.setCharacterEncoding("UTF-8");

		//String item_id = (String)req.getAttribute("item_id");
		String item_id = req.getParameter("item_id");

		TopLogic logic = new TopLogic();
		ArrayList<Item> itemList = new ArrayList<Item>();
		Item item = new Item();

		item = logic.getItemLogic(item_id); // 1件検索
		itemList.add(item); // 1件のみ追加

		//itemList = logic.getAllItemLogic();
		req.setAttribute("ItemList", itemList);

		}catch(Exception e){
			e.printStackTrace();
		}

		return page;
	}
}
