package com.rubanelearning.service;

import java.util.List;

import com.rubanelearning.entity.Buyer;

public interface BuyerService {

	Buyer save(Buyer buyer);
	
	List<Buyer> getBuyers();
}