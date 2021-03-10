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
            
    public static void main(String[] args) {
        // TODO code application logic here
        ProductManagerGUI.main(args);
        
    }
    
}
