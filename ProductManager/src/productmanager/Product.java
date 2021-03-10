/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productmanager;
import java.io.Serializable;

public class Product implements Serializable{
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
    private int productID;

    // basic constructor 
    public Product ( int productID, String productName, String productDescription, double productPrice,
            int productQuantity) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productID = productID;
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
    
    public void setProductID(int productID) {
        this.productID = productID;
    }
    public int getProductID() {
        return productID;
    }
    
    // used for saving information in the format Product wants
    public String stringSave(){
        String saveString = String.format("{%d, %s, %s, %.2f, %d}\n", getProductID(),
                getProductName(), getProductDescription(),
                getProductPrice(), getProductQuantity());
        return saveString;
    }
}
