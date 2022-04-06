package com.rafaelsantos.clients.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafaelsantos.clients.backend.model.Client;
import com.rafaelsantos.clients.backend.repository.ClientRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.clientRepository.save(new Client("Rafael", "Santos", "rafael@gmail.com"));
		this.clientRepository.save(new Client("Natasha", "Romannof", "natasha@gmail.com"));
		this.clientRepository.save(new Client("Tony", "Stark", "tony@gmail.com"));
	}

}
