package com.eccomerce.wayra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eccomerce.wayra.models.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
