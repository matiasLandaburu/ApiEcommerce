package com.carrito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.carrito.converter.UserConverter;
import com.carrito.entity.UserEntity;
import com.carrito.model.UserModel;
import com.carrito.repository.UserRepository;


@Service("userService")
public class UserService {
	private  String MSG = "La peticion salio bien";
	@Autowired
	@Qualifier("userRepository")
	private UserRepository repository;
	
	@Autowired
	@Qualifier("userConverter")
	private UserConverter converter;
	
	public String create(UserEntity userEntity) {
		 try {
			 repository.save(userEntity);
			 return this.MSG;
		 }catch(Exception e) {
			 throw e;
		 }
	}
	public String update(UserEntity userEntity) {
		 try {
			 repository.save(userEntity);
			 return this.MSG;
		 }catch(Exception e) {
			 throw e;
		 }
	}
	public String delete(String mail, long id) {
		 try {
			 UserEntity user =  repository.findByMailAndId(mail, id);
			repository.delete(user);
			 return this.MSG;
		 }catch(Exception e) {
			 throw e;
		 }
	}
	
	public List<UserModel> getAll() {
		List<UserModel> users;
		
		List<UserEntity> usersEntity = repository.findAll();
		users = converter.convertList(usersEntity);
		return users;
	}
	public UserModel getUserByMail(String mail, long id) {
		UserModel user;
		
		UserEntity userEntity = repository.findByMailAndId(mail, id);
		user = converter.convertUser(userEntity);
		return user;
	}

}
