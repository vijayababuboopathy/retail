package com.retailstore.retaildiscount.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {

	@Autowired
	IBillService billService;

	@PostMapping(value = "/bill/discount")
	public ResponseEntity<String> applyDiscount(@RequestBody BillVO billVO) {

		double discount = billService.calculateDiscount(billVO);
		double netPayable = billVO.getTotalAmount() - discount;
		return new ResponseEntity<>(String.valueOf(netPayable), HttpStatus.OK);

	}
}
