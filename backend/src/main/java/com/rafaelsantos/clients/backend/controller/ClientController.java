package com.rafaelsantos.clients.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelsantos.clients.backend.model.Client;
import com.rafaelsantos.clients.backend.repository.ClientRepository;

@RestController
@RequestMapping("api/")
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;

	@GetMapping("clients")
	public List<Client> getClient(){
		return this.clientRepository.findAll();
	}
}
