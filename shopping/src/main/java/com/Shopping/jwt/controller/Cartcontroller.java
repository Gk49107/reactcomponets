package com.Shopping.jwt.controller;




import com.Shopping.jwt.entity.Addtocart;
import com.Shopping.jwt.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.Shopping.jwt.service.CartService;

import java.util.List;

@RestController
public class Cartcontroller {

	@Autowired
	private CartService cartservice;
	
	
	@PostMapping({"/cart/add/"})
	@PreAuthorize("hasRole('User')")
	public Cart addtoCart(@RequestBody Addtocart data) {

        int productid =data.getProductid();
		System.out.println(productid);
		String username =data.getUserName();
		System.out.println(username);
		return cartservice.addTocart(productid ,username);}


	@GetMapping({"/getallcart"})
	@PreAuthorize("hasRole('Admin')")
	public List<Cart> getcart(){
	return 	cartservice.allCartitem();

	}


}
