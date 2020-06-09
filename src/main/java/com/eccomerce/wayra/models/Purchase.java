package com.eccomerce.wayra.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Purchase {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false)
	private BigDecimal total;
	@ManyToOne
	private Client client;
	@OneToMany(targetEntity = PurchaseLine.class)
	private List<PurchaseLine> purchaseLines;
	@ManyToOne
	private Payament payament;

}
