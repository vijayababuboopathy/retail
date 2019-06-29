package com.retailstore.retaildiscount.bill;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailstore.retaildiscount.customer.Customer;
import com.retailstore.retaildiscount.customer.ICustomerService;

@Service
public class BillService implements IBillService {

	

	@Autowired
	ICustomerService customerService;

	@Override
	public double calculateDiscount(BillVO billVO) {

		String customerID = billVO.getCustomerID();
		Customer customer = customerService.fatchCustomer(customerID);
		double billAmount = applyDiscount(customer, billVO);

		return billAmount;
	}

	public double applyDiscount(Customer customer, BillVO billVO) {

		double discount = 0;

		List<Items> items = billVO.getItems();
		double totalBillAmount = 0;
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getSkuType().equals("G")) {
				totalBillAmount = totalBillAmount - items.get(i).getSellingPrice();
			} else {
				totalBillAmount = totalBillAmount + items.get(i).getSellingPrice();
			}
		}

		//System.out.println("Calculated Total" + totalBillAmount);
		/**
		 * If customer is null, then just check the bill amount >100 and apply discount
		 */
		 if (null == customer) {
			if (totalBillAmount > 99) {
				discount = findOccurance(totalBillAmount) * 5;
			} else {
				discount = 0;
			}
		}else if(totalBillAmount<0) {
			discount=0;
		} else {

			/**
			 * Customer Exists, check customer or affiliate and apply the discount
			 */

			if ("E".equals(customer.getCustomerType())) {
				discount = (totalBillAmount * 30 / 100);
			} else if ("A".equals(customer.getCustomerType())) {
				discount = (totalBillAmount * 10 / 100);
			} else if ("C".equals(customer.getCustomerType())) {
				/**
				 * Check customer joined 2 years ago, then apply discount
				 */
				if (findCustomerAge(customer)) {
					discount = (totalBillAmount * 5 / 100);
				} else {
					discount = 0;
				}
			}
		}
		return discount;
	}

	public double findOccurance(double amount) {
		double occurance = amount / 100;
		return occurance;
	}

	public boolean findCustomerAge(Customer customer) {
		LocalDate now = LocalDate.now();
		Date dt = customer.getJoiningDate();
		LocalDate joinDate = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return joinDate.isBefore(now.minusYears(2));
	}
}
