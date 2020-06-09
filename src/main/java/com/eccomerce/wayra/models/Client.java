package com.eccomerce.wayra.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Client extends User {
	
	@Column(unique = true, nullable = false)
	private String phoneNumber;
	@ManyToOne
	private City city;
	@Column(unique = true, nullable = false)
	private String adress;
	@Column(unique = true, nullable = false)
	private String dni;
}
