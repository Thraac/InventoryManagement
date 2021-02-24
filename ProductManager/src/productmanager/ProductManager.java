/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productmanager;
import my.productmanager.ProductManagerGUI;
import java.util.ArrayList; 
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;

import java.io.Serializable;

public class ProductManager implements Serializable{
    
    private static ArrayList<Product> productTable = new ArrayList<Product>();
    JFrame errors = new JFrame();
    
    /**
     * @param args the command line arguments
     */
    public static void addProduct(int productID, String productName, String productDescription,
            double productPrice,int productQuantity) {
       
        productTable.add(new Product(productID, productName, productDescription, 
                productPrice, productQuantity));
       
    }
    
    // retrieves the Table information (ArrayList)
    public static ArrayList<Product> getProductTable(){
        sortID(productTable);
        return productTable;
    }
        
    // Sorts the items by the ID
    public static void sortID(ArrayList<Product> productTable){
        int array_size = productTable.size();

        for (int i = 0; i < array_size; i++){
            int minimum = i;

            // compare the elements against eachother and replace the minmum if needed
            for (int j = i+1; j < array_size; j++) {
                if (productTable.get(j).getProductID() < productTable.get(minimum).getProductID())
                    minimum = j;
            }

            // does the actual moving of elements in the ArrayList
            Product temp = productTable.get(minimum);
            productTable.set(minimum, productTable.get(i));
            productTable.set(i, temp);
        }
    }
        
    public static void betterWriteToFile(){
        try {
            FileOutputStream file = new FileOutputStream("InventoryData.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            for (Product product : productTable){
                output.writeObject(product);
            }
            output.close();
        } catch (Exception e){
            e.getStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ProductManagerGUI.main(args);
        
    }
    
}
