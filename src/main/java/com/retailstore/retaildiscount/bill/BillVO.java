package com.retailstore.retaildiscount.bill;

import java.util.List;

public class BillVO {

	private String billNo;
	private String customerID;
	private double totalAmount;

	private List<Items> items;

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	
	public BillVO() {
	
	}

	@Override
	public String toString() {
		return "BillVO [billNo=" + billNo + ", customerID=" + customerID + ", totalAmount=" + totalAmount + ", items="
				+ items + "]";
	}
	

}
