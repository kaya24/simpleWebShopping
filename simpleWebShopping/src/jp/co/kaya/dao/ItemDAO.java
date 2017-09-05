package jp.co.kaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.kaya.entity.Item;

public class ItemDAO {

	Connection con;

	/**
	 * @param con
	 */
	public ItemDAO(Connection con) {
		this.con = con;
	}

	public ArrayList<Item> getAllItem() throws SQLException {

		String sql = "select item.item_id, item_name, price, quantity, picture from (item inner join img on item.item_id = img.item_id )  inner join stock on item.item_id = stock.item_id";
		PreparedStatement stmt = null;
		ResultSet res = null;

		ArrayList<Item> itemList = new ArrayList<>();

		try {
			stmt = con.prepareStatement(sql);
			res = stmt.executeQuery();

			while (res.next()) {
				Item item = new Item();
				item.setItem_id(res.getString("item_id"));
				item.setItem_name(res.getString("item_name"));
				item.setPrice(res.getInt("price"));
				item.setQuantity(res.getInt("quantity"));
				item.setPicture(res.getString("picture"));
				itemList.add(item);
			}

		} finally {

		}
		return itemList;
	}

	public Item getItem(String item_id) throws SQLException {
		// String sql =
		// "select item_id, item_name, price from item where item_id=?";
		// String sql =
		// "select item.item_id, item_name, price, quantity from item inner join stock on item.item_id = stock.item_id where item.item_id=?";
		String sql = "select item.item_id, item_name, price, quantity, picture from (item inner join img on item.item_id = img.item_id )  inner join stock on item.item_id = stock.item_id where item.item_id=?";
		PreparedStatement stmt = null;
		ResultSet res = null;
		Item item = null;

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, item_id);

			res = stmt.executeQuery();

			if (res.next()) {
				item = new Item();
				item.setItem_id(res.getString("item_id"));
				item.setItem_name(res.getString("item_name"));
				item.setPrice(res.getInt("price"));
				item.setPicture(res.getString("picture"));
				item.setQuantity(res.getInt("quantity"));
			}

		} finally {
			if (res != null) {
				res.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}

		return item;
	}

}
