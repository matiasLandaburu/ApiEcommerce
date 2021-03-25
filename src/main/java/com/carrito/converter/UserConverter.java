package com.carrito.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.carrito.entity.UserEntity;
import com.carrito.model.UserModel;

@Component("userConverter")
public class UserConverter {

	public List<UserModel> convertList(List<UserEntity> userEntityList) {
		List<UserModel> userModelList = new ArrayList<>();

		for (UserEntity userEntity : userEntityList) {
			userModelList.add(new UserModel(userEntity));
		}
		return userModelList;
	}

	public UserModel convertUser(UserEntity userEntity) {

		UserModel userModel = new UserModel(userEntity);

		return userModel;
	}

}
