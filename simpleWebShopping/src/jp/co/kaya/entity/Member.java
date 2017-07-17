package jp.co.kaya.entity;

import java.io.Serializable;

public class Member implements Serializable{

	private String memberId;
	private String password;
	private String address;
	private int memberPoint;
	/**
	 * @param memberId
	 * @param password
	 * @param address
	 * @param memberPoint
	 */
	public Member(String memberId, String password, String address,
			int memberPoint) {
		super();
		this.memberId = memberId;
		this.password = password;
		this.address = address;
		this.memberPoint = memberPoint;
	}
	/**
	 * @return memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId セットする memberId
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return memberPoint
	 */
	public int getMemberPoint() {
		return memberPoint;
	}
	/**
	 * @param memberPoint セットする memberPoint
	 */
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}


}
