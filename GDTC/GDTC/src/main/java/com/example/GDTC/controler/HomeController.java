package com.example.GDTC.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.GDTC.Entity.User;
import com.example.GDTC.Services.UserService;

import Responses.Reply;
import jakarta.validation.Valid;

@RestController
public class HomeController {
	@Autowired
	UserService us;
	
	@PostMapping("/user")
	public ResponseEntity<Reply> save(@RequestBody @Valid User user){
		
		return new ResponseEntity<>(us.createUser(user),HttpStatus.OK);
		
	}
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getByid(@PathVariable("id") int  id) {
		
		return new ResponseEntity<>(us.getUser(id),HttpStatus.OK);
	}
	@GetMapping("/user")
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<>(us.getUsers(),HttpStatus.OK);
	}

	@PutMapping("/user")
	public ResponseEntity<Reply> update(@RequestBody @Valid User user){
		
		return new ResponseEntity<>(us.updateUser(user),HttpStatus.OK);
		
	}
	@DeleteMapping("/user/{id}")
	public  ResponseEntity<Reply>  deleteByid(@PathVariable("id") int  id) {
		return new ResponseEntity<>(us.deleteUser(id),HttpStatus.OK);
	}
}
