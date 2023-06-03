package com.Shopping.jwt.service;

import com.Shopping.jwt.dao.UserDao;
import com.Shopping.jwt.entity.Cart;
import com.Shopping.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shopping.jwt.configuration.JwtRequestFilter;
import com.Shopping.jwt.dao.CartDao;
import com.Shopping.jwt.dao.ProductDao;
import com.Shopping.jwt.entity.Product;

import java.util.List;

@Service
public class CartService {
	@Autowired
	private CartDao cartdao;
	
	@Autowired
	private ProductDao productdao;

	@Autowired
	private UserDao userdao;
	
	public Cart addTocart(Integer productid ,String username ) {
		
		Product product = productdao.findById(productid).get();
		System.out.println(product);
		User user = userdao.findById(username).get();
		  System.out.println(user);
		  if(user !=null && product !=null) {

			  Cart cart = new Cart(product, user);
			  System.out.println(cart);
			  return cartdao.save(cart);
		  }

		return  null;
	}
	public List<Cart> allCartitem(){
		return (List<Cart>) cartdao.findAll();
	}

	public void insiatecart(){

		Cart newcart = new Cart();
		Product product = productdao.findById(23).get();
		User user= userdao.findById("gopi1@gmail.com").get();
		  newcart.setProduct(product);
		  newcart.setUser(user);



	}



}
