package com.carrito.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.carrito.entity.CartEntity;

import com.carrito.model.CartModel;


@Component("cartConverter")
public class CartConverter {
	
	public List<CartModel> convertList(List <CartEntity> cartEntityList){
		List<CartModel> cartModelList = new ArrayList<>();
		
		for(CartEntity cartEntity: cartEntityList ) {
			cartModelList.add(new CartModel(cartEntity));
		}
		return cartModelList;
	}
	
	public CartModel convertCart(CartEntity cartEntity) {

		CartModel cartModel = new CartModel(cartEntity);

		return cartModel;
	}
}
