package com.eccomerce.wayra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eccomerce.wayra.models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
