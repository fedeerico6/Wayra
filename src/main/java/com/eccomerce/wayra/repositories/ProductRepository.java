package com.eccomerce.wayra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eccomerce.wayra.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}