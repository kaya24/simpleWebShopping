package jp.co.kaya.entity;

import java.io.Serializable;

public class Item implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String item_id;
	private String item_name;
	private int price;
	private int quantity;
	private String picture;

	/**
	 * @param item_id
	 * @param item_name
	 * @param price
	 * @param quantity
	 * @param picture
	 */
	public Item(String item_id, String item_name, int price, int quantity,
			String picture) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.price = price;
		this.quantity = quantity;
		this.picture = picture;
	}

	public Item(){

	}

	/**
	 * @return item_id
	 */
	public String getItem_id() {
		return item_id;
	}
	/**
	 * @param item_id セットする item_id
	 */
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	/**
	 * @return item_name
	 */
	public String getItem_name() {
		return item_name;
	}
	/**
	 * @param item_name セットする item_name
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity セットする quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture セットする picture
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}


}
