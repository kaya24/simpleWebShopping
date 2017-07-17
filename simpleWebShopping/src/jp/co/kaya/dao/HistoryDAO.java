package jp.co.kaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.kaya.entity.History;

public class HistoryDAO {

	Connection con;

	/**
	 * @param con
	 */
	public HistoryDAO(Connection con) {
		this.con = con;
	}

	public History getHistoryData(String id) throws SQLException{
		String sql = "";

		PreparedStatement stmt = null;
		ResultSet res = null;
		History history = null;

		try{
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);

			res = stmt.executeQuery();

			if(res.next()){
				history = new History();
				history.setId(res.getString("id"));
				history.setItem_id(res.getString("item_id"));
				history.setItem_name(res.getString("item_name"));
				history.setPrice(res.getInt("price"));
			}

		}finally{
			if(res != null){
				res.close();
			}
			if(stmt != null){
				stmt.close();
			}
		}

		return history;
	}


	/**
	 * @param history
	 * @return
	 */
	public boolean insertHistoryData(History history){
		return true;
	}

}
