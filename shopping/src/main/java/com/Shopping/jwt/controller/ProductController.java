package com.Shopping.jwt.controller;




import java.util.List;
import java.util.Optional;

import com.Shopping.jwt.entity.Addproductrequest;
import com.Shopping.jwt.entity.ImageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.Shopping.jwt.entity.Category;
import com.Shopping.jwt.entity.Product;
import com.Shopping.jwt.service.Productservice;



@RestController
public class ProductController {
  
	@Autowired
	private Productservice productservice;
	
	@PostMapping( {"/product/add"})
	@PreAuthorize("hasRole('Admin')")
	public Product addproduct(@RequestBody Addproductrequest product)
	{
		Integer id = product.getCategoryid();
		System.out.println(id);
		return productservice.addproduct(product.getProductname() ,product.getDiscription(),product.getPrice(),product.getDiscount(),product.getBrand(),product.getImage(),id );
	}

	@PostMapping({"/product/category/add"})
	@PreAuthorize("hasRole('Admin')")
	public Category addcCategory(@RequestBody Category category) {
		return productservice.addcatogary(category);
	}
	
	

	@GetMapping({"/product/getallproducts"})
	@PreAuthorize("hasRole('Admin')")
	public List<Product> getAllproducts(){
		return productservice.getallproducts();
	}
	
	@GetMapping({"/product/getallproduct1"})
	@PreAuthorize("hasRole('User')")
	public List<Product> getAllproduct1(){
		return productservice.getallproduct1();
	}
	
	
	@GetMapping({"/product/getallcategory"})
	@PreAuthorize("hasRole('Admin')")
	public List<Category> getallcatogary(){
		return productservice.getallcatogary();
	}
	
	
	
	
	@DeleteMapping({"/product/delete/{productid}"})
	@PreAuthorize("hasRole('Admin')")
	public void deleteproduct(@PathVariable("productid") Integer productid) {
		
		productservice.deleteproduct(productid);
	}
	
	
	 @GetMapping("/product/update/{productid}")
		@PreAuthorize("hasRole('Admin')")
	  public Product getProductById(@PathVariable("productid") Integer id) {
		  Product product = productservice.getProductById(id);
		 
		 return product;   
	 }
	 
	 
	 @GetMapping("/product/get/{productid}")
		@PreAuthorize("hasRole('User')")
	  public Product getuserProductById(@PathVariable("productid") Integer id) {
		  Product product = productservice.getuserProductById(id);
		 
		 return product;
		 
    }

	@GetMapping("/product/category/get/{categoryid}")
	@PreAuthorize("hasRole('Admin')")
	public Category getCatogrybyid(@PathVariable("categoryid") Integer id){
		Category category = productservice.getCatogrybyid(id);
		return category;
	}


	 @PutMapping("/product/update/{productid}")
		@PreAuthorize("hasRole('Admin')")
	 public ResponseEntity<Product> updateProduct(
		      @PathVariable("productid") Integer id,
		      @RequestBody Product updatedProduct) {
		    Product product = productservice.updateProduct(id, updatedProduct);

		    if (product != null) {
		      return new ResponseEntity<>(product, HttpStatus.OK);
		    } else {
		      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }
		  }
	
	
	
	/*
	 * @PostMapping( value = {"/product/add"} , consumes =
	 * {MediaType.MULTIPART_FORM_DATA_VALUE}) public Product
	 * addProduct(@RequestPart("Product") Product
	 * product,@RequestPart("imagefile")MultipartFile[] file) { try {
	 * Set<ImageModel> images =uploadimage(file); product.setProductimages(images);
	 * productservice.addproduct(product); }catch(Exception e) {
	 * System.out.println(e.getMessage()); } return null;
	 * 
	 * }
	 * 
	 * public ResponseEntity<Product> addProduct(@RequestParam String Productname,
											  @RequestParam String discription,
											  @RequestParam Double price,
											  @RequestParam Double Discount,
											  @RequestParam String Brand,
											  @RequestParam String image,

											  @RequestParam Integer catogeryid) {


		Product product	=   productservice.addproduct( Productname,discription,Discount,price,Brand,image,catogeryid);
		return ResponseEntity.ok(product);
	}
	 *
	 *
	 *
	 *
	 * 
	 * 
	 * public Set<ImageModel> uploadimage(MultipartFile[] multipartFiles) throws
	 * IOException {
	 * 
	 * Set<ImageModel> imagemodels = new HashSet<>();
	 * 
	 * for(MultipartFile file:multipartFiles) { ImageModel imagemodel = new
	 * ImageModel( file.getOriginalFilename(), file.getContentType(),
	 * file.getBytes() ); imagemodels.add(imagemodel); }
	 * 
	 * return imagemodels; }
	 */
}
