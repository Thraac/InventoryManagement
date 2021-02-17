/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productmanager;
import my.productmanager.ProductManagerGUI;
import java.util.ArrayList;

public class ProductManager {
    
    private static ArrayList<Product> productTable = new ArrayList<Product>();
    
    /**
     * @param args the command line arguments
     */
    public static void addProduct(int productID, String productName, String productDescription,
            double productPrice,int productQuantity) {
        
        productTable.add(new Product(productID, productName, productDescription, 
                productPrice, productQuantity));
    }
    
    public static Product mostRecent() {
        Product newest = productTable.get(productTable.size()-1);
        return newest;
    }
    
    public static ArrayList<Product> getProductTable(){
        sortID(productTable);
        return productTable;
    }
    
    public static Product getProductFor(){
        for (Product product : productTable){
            return product;
        }
        return null;
    }
    
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
