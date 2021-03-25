package com.carrito.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.carrito.entity.ProductEntity;
import com.carrito.model.ProductModel;

@Component("productConverter")
public class ProductConverter {
	
	public List<ProductModel> convertList(List <ProductEntity> productEntityList){
		List<ProductModel> productModelList = new ArrayList<>();
		
		for(ProductEntity productEntity: productEntityList ) {
			productModelList.add(new ProductModel(productEntity));
		}
		return productModelList;
	}

}
