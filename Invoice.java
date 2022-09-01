package com.oops.bll;

public class Invoice {
	private String id;
	private String desc;
	private int qty;
	private double Unitprice;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getUnitprice() {
		return Unitprice;
	}
	public void setUnitprice(double unitprice) {
		Unitprice = unitprice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	Invoice(String id, String desc, int qty, double unitprice) {
		
	}
			
	

}
