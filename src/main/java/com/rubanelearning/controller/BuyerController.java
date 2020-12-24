package com.rubanelearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubanelearning.entity.Buyer;
import com.rubanelearning.entity.BuyerContact;
import com.rubanelearning.service.BuyerService;

@RestController
public class BuyerController {

	@Autowired
	BuyerService buyerService;
	
	@GetMapping("/buyers")
	public List<Buyer> getBuyers() {
		return buyerService.getBuyers();
	}
	
	@GetMapping("/add-buyer")
	public List<Buyer> addBuyer() {
		Buyer buyer = new Buyer();
		buyer.setFirstName("Balasubramaniyam");
		buyer.setLastName("Ninthuyan");
		buyer.setGender("Male");
		
		BuyerContact buyerContact = new BuyerContact();
		buyerContact.setAddress("Chavakachcheri");
		buyerContact.setEmail("ninthu@slt.lk");
		buyerContact.setContact("+65 87878787");
		buyerContact.setFax("+65 88888888");
		
		buyer.setBuyerContact(buyerContact);
		buyerContact.setBuyer(buyer);
		
		buyerService.save(buyer);
		
		return buyerService.getBuyers();
	}
}