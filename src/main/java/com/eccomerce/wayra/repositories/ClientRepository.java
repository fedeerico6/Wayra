package com.eccomerce.wayra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eccomerce.wayra.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
