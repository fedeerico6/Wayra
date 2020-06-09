package com.eccomerce.wayra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eccomerce.wayra.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
