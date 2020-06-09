package com.eccomerce.wayra.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false)
	private String name;

}
