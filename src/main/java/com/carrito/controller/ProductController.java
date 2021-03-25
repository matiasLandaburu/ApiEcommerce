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
import com.carrito.service.ProductService;
import com.carrito.model.ProductModel;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	@Qualifier("productService")
	ProductService service;

	@PutMapping("/put")

	public String addProduct(@RequestBody @Valid ProductEntity product) {
		return service.create(product);
	}
	
	@PostMapping("/post")
	public String updateProduct(@RequestBody @Valid ProductEntity product) {
		return service.update(product);
	}
	
	@DeleteMapping("/delete/{id}/{name}")
	public String deleteProduct(@PathVariable("id") long id, @PathVariable("name")String name) {
		return service.delete(name, id);
		
	}
	@GetMapping("/getAll")
	public List<ProductModel> getProducts() {
		return service.getAll();
		
	}
}
