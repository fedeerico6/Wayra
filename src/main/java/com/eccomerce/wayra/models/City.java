package com.eccomerce.wayra.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class City {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String postalCode;

}
