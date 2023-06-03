package com.Shopping.jwt.dao;

import org.springframework.data.repository.CrudRepository;

import com.Shopping.jwt.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CatogaryDao extends CrudRepository<Category, Integer>{

}
