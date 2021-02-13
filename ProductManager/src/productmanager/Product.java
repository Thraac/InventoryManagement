/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productmanager;

/**
 *
 * @author Nation
 */
public class Product {
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;

    // basic constructor 
    Product (String productName, String productDescription, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    // Setters and getters
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public String getProductDescription() {
        return productDescription;
    }
    
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public double getProductPrice() {
        return productPrice;
    }
    
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
}
