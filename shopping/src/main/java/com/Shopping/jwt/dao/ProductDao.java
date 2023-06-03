package com.Shopping.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Shopping.jwt.entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer>
{

}
