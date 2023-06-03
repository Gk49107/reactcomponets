package com.Shopping.jwt.entity;




import javax.persistence.*;


@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer productid;
	private  String productname;
	@Column(name ="discription", length = 4000)
	private  String Discription;
	private  Double price;
	

	private  Double Discount;
	private  String Brand;
	private String image;
	
	
	@ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;

	

	/*
	 * @ManyToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name="product_images", joinColumns = {
	 * 
	 * @JoinColumn(name = "productid") }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "imageid") }) private Set<ImageModel> productimages;
	 * 
	 * 
	 * 
	 * 
	 * public Set<ImageModel> getProductimages() { return productimages; } public
	 * void setProductimages(Set<ImageModel> productimages) { this.productimages =
	 * productimages; } 
	 */
	
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}

	
	public Integer getProductid() {
		return productid;
	}
	public Product(Integer productid, String productname, String discription, Double price, Double discount,
			String image) {
		super();
		this.productid = productid;
		this.productname = productname;
		Discription = discription;
		this.price = price;
		Discount = discount;
		this.image = image;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDiscount() {
		return Discount;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public void setDiscount(Double discount) {
		Discount = discount;
	}

	
	public Product() {
		
	}
	
	

}
