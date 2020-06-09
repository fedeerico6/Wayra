package com.eccomerce.wayra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eccomerce.wayra.models.PurchaseLine;

@Repository
public interface PurchaseLineRepository extends JpaRepository<PurchaseLine, Integer> {

}
