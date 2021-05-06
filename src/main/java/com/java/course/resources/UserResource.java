package com.java.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	//acessar usuarios
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria Joaquina", "maria@gmail.com", "9999990000","123456");
		return ResponseEntity.ok().body(u);
		
	}
}
