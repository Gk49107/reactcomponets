package com.Shopping.jwt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	
	
	public Cart() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartid;

	@OneToOne
	private Product product;
	
	@OneToOne
	private User user;

	public Integer getCartid() {
		return cartid;
	}

	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public Cart(Product product, User user) {
		this.product = product;
		this.user = user;
	}
}
