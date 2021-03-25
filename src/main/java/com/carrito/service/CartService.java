package com.carrito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.carrito.converter.CartConverter;

import com.carrito.entity.CartEntity;

import com.carrito.model.CartModel;

import com.carrito.repository.CartRepository;

@Service("cartService")
public class CartService {
	private String MSG = "La peticion salio bien";
	@Autowired
	@Qualifier("cartRepository")
	private CartRepository repository;

	@Autowired
	@Qualifier("cartConverter")
	private CartConverter converter;

	public String create(CartEntity cartEntity) {
		try {
			repository.save(cartEntity);
			return this.MSG;
		} catch (Exception e) {
			throw e;
		}
	}

	public String update(CartEntity cartEntity) {
		try {
			repository.save(cartEntity);
			return this.MSG;
		} catch (Exception e) {
			throw e;
		}
	}

	public String delete(long id) {
		try {
			CartEntity cart = repository.findById(id);
			repository.delete(cart);
			return this.MSG;
		} catch (Exception e) {
			throw e;
		}
	}
	public String deleteAll() {
		try {
			repository.deleteAll();
			return this.MSG;
		} catch (Exception e) {
			throw e;
		}
	}

	public List<CartModel> getAll() {
		List<CartModel> cartList;

		List<CartEntity> cartEntityList = repository.findAll();
		cartList = converter.convertList(cartEntityList);
		return cartList;
	}

	public CartModel getById(long id) {
		CartModel cartList;

		CartEntity cartEntityList = repository.findById(id);
		cartList = converter.convertCart(cartEntityList);
		return cartList;
	}

}
