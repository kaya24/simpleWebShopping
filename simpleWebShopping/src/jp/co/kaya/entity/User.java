package jp.co.kaya.entity;

import java.io.Serializable;

public class User implements Serializable{

	private String id;
	private String pass;
	private String name;
	private int age;
	private History history;

	public User(){

	}

	/**
	 * @param id
	 * @param pass
	 * @param name
	 * @param age
	 * @param history
	 */
	public User(String id, String pass, String name, int age, History history) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.history = history;
	}
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass セットする pass
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return history
	 */
	public History getHistory() {
		return history;
	}
	/**
	 * @param history セットする history
	 */
	public void setHistory(History history) {
		this.history = history;
	}



}
