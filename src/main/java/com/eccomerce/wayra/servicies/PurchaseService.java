package com.eccomerce.wayra.servicies;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eccomerce.wayra.models.Purchase;
import com.eccomerce.wayra.repositories.PurchaseRepository;

@Service
public class PurchaseService {
	
	@Autowired
	private PurchaseRepository repository;
	
	public Optional<Purchase> save(Purchase purchase) {
		return Optional.of(repository.save(purchase));
	}
	
	

}
