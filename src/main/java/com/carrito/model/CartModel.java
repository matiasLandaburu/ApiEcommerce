package com.carrito.model;

import com.carrito.entity.CartEntity;
import com.carrito.entity.ProductEntity;

public class CartModel {
	private long id;
	
	private ProductEntity product;
	
	public CartModel(CartEntity cart) {
		super();
		this.id = cart.getId();
		this.product = cart.getProduct();
	}

	public CartModel(long id, ProductEntity product) {
		super();
		this.id = id;
		this.product = product;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
	
	
}
