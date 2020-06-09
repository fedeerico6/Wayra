package com.eccomerce.wayra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eccomerce.wayra.models.Payament;

@Repository
public interface PayamentRepository extends JpaRepository<Payament, Integer> {

}
