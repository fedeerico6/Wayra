package com.eccomerce.wayra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.eccomerce.wayra.models.Purchase;
import com.eccomerce.wayra.servicies.PurchaseService;

@RestController
@RequestMapping("purchase")
public class PurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;
	
	@PostMapping("save")
	public ResponseEntity<Purchase> save(@RequestBody Purchase purchase) {
		return ResponseEntity.of(purchaseService.save(purchase));
	}

}
