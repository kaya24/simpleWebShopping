package jp.co.kaya.dao;

import java.sql.Connection;

import jp.co.kaya.entity.User;

public class TestUserDAO {
	public static void main(String args[]){

		Connection con = null;
		con = DBManager.getConnection();

		try{
		UserDAO udao = new UserDAO(con);

		String id = "web01";
		String pass = "password";

		User user = null;
		user = udao.logincheck(id, pass);

		System.out.println("id :" + user.getId());
		System.out.println("pass :" + user.getPass());
		System.out.println("name :" + user.getName());
		System.out.println("age :" + user.getAge());

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
