package com.Shopping.jwt.entity;




public class Addproductrequest {
    private  String productname;
    private  String Discription;
    private  Double price;


    private  Double Discount;
    private  String Brand;
    private String image;

    public Addproductrequest(){

    }

    public Addproductrequest(String productname, String discription, Double price, Double discount, String brand, String image, Integer categoryid) {
        this.productname = productname;
        Discription = discription;
        this.price = price;
        Discount = discount;
        Brand = brand;
        this.image = image;
        this.categoryid = categoryid;
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

    public void setDiscount(Double discount) {
        Discount = discount;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    private Integer categoryid;




}
