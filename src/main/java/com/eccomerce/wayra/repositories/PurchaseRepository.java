package com.eccomerce.wayra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eccomerce.wayra.models.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
