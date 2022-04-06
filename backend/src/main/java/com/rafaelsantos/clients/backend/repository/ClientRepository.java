package com.rafaelsantos.clients.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaelsantos.clients.backend.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
