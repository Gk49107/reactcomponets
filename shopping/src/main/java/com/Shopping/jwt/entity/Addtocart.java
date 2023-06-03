package com.Shopping.jwt.entity;

public class Addtocart {
    private int productid;
    private String userName;

    public  Addtocart(){

    }
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
