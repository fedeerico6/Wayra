package com.eccomerce.wayra.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Payament {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String tipo;

}
