package com.example.team2000javaserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.team2000javaserver.model.Hello;
import com.example.team2000javaserver.repositories.HelloRepository;

@RestController
public class HelloService {
	@Autowired
	HelloRepository repository;	
	
	@GetMapping("/api/hello")
	public Iterable<Hello> findAllHellos() {
		return repository.findAll();
	}
	
	@PostMapping("/api/hello")
	public Hello createHello
	(@RequestBody Hello hello) {
			return repository.save(hello);
	}
	
	@DeleteMapping("/api/hello/{helloId}")
	public void deleteHello
	(@PathVariable("helloId") int id) {
			repository.deleteById(id);
	}


}
