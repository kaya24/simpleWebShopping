package jp.co.kaya.entity;

import java.io.Serializable;

public class History implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int order_id;
	private String id; // ユーザID
	private String item_id;
	private String item_name;
	private int price;
	private int quantity;

	public History(){

	}
	/**
	 * @param order_id
	 * @param id
	 * @param item_id
	 * @param item_name
	 * @param price
	 * @param quantity
	 */
	public History(int order_id, String id, String item_id, String item_name,
			int price, int quantity) {
		super();
		this.order_id = order_id;
		this.id = id;
		this.item_id = item_id;
		this.item_name = item_name;
		this.price = price;
		this.quantity = quantity;
	}
	/**
	 * @return order_id
	 */
	public int getOrder_id() {
		return order_id;
	}
	/**
	 * @param order_id セットする order_id
	 */
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
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


}
