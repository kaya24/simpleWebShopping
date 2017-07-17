package jp.co.kaya.logic;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.kaya.dao.DBManager;
import jp.co.kaya.dao.ItemDAO;
import jp.co.kaya.entity.Item;

public class TopLogic {

	public ArrayList<Item> getAllItemLogic() {

		Connection con = null;
		con = DBManager.getConnection();
		ArrayList<Item> itemList = new ArrayList<Item>();

		try {
			ItemDAO idao = new ItemDAO(con);
			itemList = idao.getAllItem();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return itemList;
	}

	public Item getItemLogic(String item_id) {

		Connection con = null;
		con = DBManager.getConnection();
		Item item = null;

		try {
			ItemDAO idao = new ItemDAO(con);
			item = idao.getItem(item_id);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return item;
	}
}
