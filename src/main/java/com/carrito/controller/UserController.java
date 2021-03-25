package com.carrito.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrito.entity.ProductEntity;
import com.carrito.entity.UserEntity;
import com.carrito.model.ProductModel;
import com.carrito.model.UserModel;
import com.carrito.service.ProductService;
import com.carrito.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	UserService service;

	@PutMapping("/put")

	public String addUser(@RequestBody @Valid UserEntity user) {
		return service.create(user);
	}
	
	@PostMapping("/post")
	public String updateUser(@RequestBody @Valid UserEntity user) {
		return service.update(user);
	}
	
	@DeleteMapping("/delete/{id}/{mail}")
	public String deleteUser(@PathVariable("id") long id, @PathVariable("mail")String mail) {
		return service.delete(mail, id);
		
	}
	@GetMapping("/getAll")
	public List<UserModel> getUsers() {
		return service.getAll();
		
	}
	@GetMapping("/getByMail/{id}/{mail}")
	public UserModel getUserByMail(@PathVariable("id") long id, @PathVariable("mail")String mail) {
		return service.getUserByMail(mail, id);
		
	}
	
	

}
