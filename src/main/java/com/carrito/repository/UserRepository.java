package com.carrito.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrito.entity.UserEntity;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<UserEntity, Serializable> {
	
	public abstract UserEntity findByMail (String mail);
	
	public abstract List<UserEntity> findAll ();
	
	public abstract UserEntity findByMailAndId (String mail, long id);

}
