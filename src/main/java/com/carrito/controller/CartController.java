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

import com.carrito.entity.CartEntity;

import com.carrito.model.CartModel;

import com.carrito.service.CartService;


@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	@Qualifier("cartService")
	CartService service;

	@PutMapping("/put")

	public String addProductToCart(@RequestBody @Valid CartEntity cart) {
		return service.create(cart);
	}
	
	@PostMapping("/post")
	public String updateProductInCart(@RequestBody @Valid CartEntity cart) {
		return service.update(cart);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProductInCart(@PathVariable("id") long id) {
		return service.delete(id);
		
	}
	@DeleteMapping("/deleteAll")
	public String deleteAllProductInCart() {
		return service.deleteAll();
		
	}
	@GetMapping("/getAll")
	public List<CartModel> getUsers() {
		return service.getAll();
		
	}
	@GetMapping("/getById/{id}")
	public CartModel getUserById(@PathVariable("id") long id) {
		return service.getById(id);
		
	}
}
