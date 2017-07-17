package jp.co.kaya.entity;

import java.io.Serializable;

public class Stock implements Serializable{

	private String item_id;
	private int quantity;

	/**
	 * @param item_id
	 * @param quantity
	 */
	public Stock(String item_id, int quantity) {
		super();
		this.item_id = item_id;
		this.quantity = quantity;
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


}
