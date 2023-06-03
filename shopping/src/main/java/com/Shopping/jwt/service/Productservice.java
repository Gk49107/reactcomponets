package com.Shopping.jwt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shopping.jwt.dao.CatogaryDao;
import com.Shopping.jwt.dao.ProductDao;
import com.Shopping.jwt.entity.Category;
import com.Shopping.jwt.entity.Product;

@Service
public class Productservice {
	@Autowired
	private ProductDao productdao;
	
	@Autowired
	private CatogaryDao catogeryDao;
	

	public Product addproduct( String Productname,
							  String Discription,
							   Double price,
							   Double Discount,
							   String Brand,
							   String image,
							   Integer categoryid)
	{
	     
		Category category = catogeryDao.findById(categoryid).orElseThrow(() -> new IllegalArgumentException("Category not found"));

		Product product = new Product();
		  product.setProductname(Productname);
		  product.setDiscription(Discription);
		 product.setPrice(price);
		  product.setDiscount(Discount);
		product.setBrand(Brand);
		  product.setImage(image);
		  product.setCategory(category);
		  return 	productdao.save(product);
	}


	public Category addcatogary(Category category) {
		
		return catogeryDao.save(category);
		}
	
	public List<Product> getallproducts(){
	return	(List<Product>) productdao.findAll();
	}
	
	public List<Product> getallproduct1(){
		return	(List<Product>) productdao.findAll();
		}
		
	
	public List<Category> getallcatogary(){
		return	 (List<Category>) catogeryDao.findAll();
		}
	
	
	 public Product getProductById(Integer id) {
		    return productdao.findById(id).get();
		  }

      public Category getCatogrybyid(Integer id){
		return catogeryDao.findById(id).get();
	  }

	 public Product getuserProductById(Integer id) {
		    return productdao.findById(id).get();
		  }
	
	
    public void deleteproduct(Integer productid) {
    	
    	productdao.deleteById(productid);
    	
    }
    
	public Product updateProduct(Integer id, Product updatedProduct) {
		
		Product product = productdao.findById(id).orElse(null);

	    if (product != null) {
	      product.setProductname(updatedProduct.getProductname());
	      product.setDiscount(updatedProduct.getDiscount());
	      product.setDiscription(updatedProduct.getDiscription());
	      product.setPrice(updatedProduct.getPrice());
	      product.setImage(updatedProduct.getImage());
	      	      return productdao.save(product);
	    } else {
	      return null;
	    }
		
	}


	/*public Product addproduct(Product product) {
		   Integer id = product.getCategory().getCategoryid();

		   Category catogary =  catogeryDao.findById(id).get();
		   Product product1= new Product();
               product1.setCategory(catogary);
		productdao.save(product);
		return product;
	} */
}




