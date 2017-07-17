package jp.co.kaya.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import jp.co.kaya.entity.Item;
import jp.co.kaya.logic.TopLogic;

public class TopAction implements ActionInterface {

	public String execute(HttpServletRequest req){
		String page = "/index.jsp";

		try{
		req.setCharacterEncoding("UTF-8");

		//String item_id = (String)req.getAttribute("item_id");

		TopLogic logic = new TopLogic();
		ArrayList<Item> itemList = new ArrayList<Item>();

		itemList = logic.getAllItemLogic();
		req.setAttribute("ItemList", itemList);

		}catch(Exception e){
			e.printStackTrace();
		}

		return page;
	}

	/*
	 * public boolean sessionCheck(HttpServletRequest req){ HttpSession session
	 * = req.getSession(); if(session.getAttribute("CommonLoginMember") !=
	 * null){ return true; }else{ return false; } }
	 */
}
