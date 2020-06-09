package com.eccomerce.wayra.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class PurchaseLine {
	
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	private Product product;
	@Column(nullable = false)
	private BigDecimal quantity;

}
