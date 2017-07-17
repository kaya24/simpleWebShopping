package jp.co.kaya.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.kaya.entity.Item;

public class TestItemDAO {
	public static void main(String[] args) {

		Connection con = null;
		con = DBManager.getConnection();

		try{
			ItemDAO idao = new ItemDAO(con);
			Item item = null;
			String item_id = "s0001";
			item = idao.getItem(item_id);

			if(item == null){
				System.out.println("item_id :" + item_id + " の商品がありません");
			}else{
				System.out.println("item_id : " + item.getItem_id());
				System.out.println("item_name : " + item.getItem_name());
				System.out.println("item_price : " + item.getPrice());
				System.out.println("item_quantity :" + item.getQuantity());
				System.out.println("-----------------------------");
			}

			ArrayList<Item> itemList = new ArrayList<Item>();
			itemList = idao.getAllItem();

			for(Item i: itemList){
				System.out.println(i.getItem_id());
				System.out.println(i.getItem_name());
				System.out.println(i.getPrice());
				System.out.println(i.getQuantity());
				System.out.println(i.getPicture());
				System.out.println("-----------------------------");
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}

	}

}
