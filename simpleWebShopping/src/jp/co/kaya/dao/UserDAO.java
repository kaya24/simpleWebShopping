package jp.co.kaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.kaya.entity.User;

public class UserDAO {

	Connection con;

	/**
	 * @param con
	 */
	public UserDAO(Connection con) {
		this.con = con;
	}


	/**
	 * idとpassをもとに，ユーザー情報を検索する．
	 * @param id
	 * @param pass
	 * @return
	 * @throws SQLException
	 */
	public User logincheck(String id, String pass) throws SQLException{

		String sql = "select id, pass, name, age from user where id=?";
		PreparedStatement stmt = null;
		ResultSet res = null;
		User user = null;

		try{
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);

			res = stmt.executeQuery();

			if(res.next()){
				user = new User();
				user.setId(res.getString("id"));
				user.setPass(res.getString("pass"));
				user.setName(res.getString("name"));
				user.setAge(res.getInt("age"));
			}

		}finally{
			if(res != null){
				res.close();
			}
			if(stmt != null){
				stmt.close();
			}
		}

		return user;
	}

}
