package com.Shopping.jwt.dao;

import org.springframework.data.repository.CrudRepository;

import com.Shopping.jwt.entity.Cart;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer> {
	
	
	

}
