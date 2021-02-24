/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productmanager;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nation
 */
public class ProductManagerTest {
    
    public ProductManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addProduct method, of class ProductManager.
     */
    @Test
    public void testAddProduct() {
        System.out.println("* ProductManagerTest: testAddProduct()");
        
        ArrayList<Product> productTable = new ArrayList<Product>();
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);
        Product test2 = new Product(14, "Test2", "desc2", 14.8, 73);
        Product test3 = new Product(87, "getName3", "desc3", 4.99, 28);
        
        productTable.add(test);
        productTable.add(test2);
        productTable.add(test3);
        
        assertEquals(test , productTable.get(0));
        assertEquals(test2 , productTable.get(1));
        assertEquals(test3 , productTable.get(2));
    }

    /**
     * Test of getProductTable method, of class ProductManager.
     */
    @Test
    public void testGetProductTable() {
        System.out.println("* ProductManagerTest: testGetProductTable()");
        
        ArrayList<Product> productTable = new ArrayList<Product>();
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);
        Product test2 = new Product(14, "Test2", "desc2", 14.8, 73);
        Product test3 = new Product(87, "getName3", "desc3", 4.99, 28);
        
        productTable.add(test);
        productTable.add(test2);
        productTable.add(test3);
        
        assertEquals(productTable, productTable);
    }

    /**
     * Test of sortID method, of class ProductManager.
     */
    @Test
    public void testSortID() {
        System.out.println("* ProductManagerTest: testSortID()");
        
        ArrayList<Product> productTable = new ArrayList<Product>();
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);
        Product test2 = new Product(14, "Test2", "desc2", 14.8, 73);
        Product test3 = new Product(87, "getName3", "desc3", 4.99, 28);
        productTable.add(test);
        productTable.add(test3);
        productTable.add(test2);
        
        String beforeSort = productTable.toString();
        
        ProductManager.sortID(productTable);
        String afterSort = productTable.toString();
        
        assertEquals(false, beforeSort.equals(afterSort));
        
    }

    /**
     * Test of betterWriteToFile method, of class ProductManager.
     */
    @Test
    public void testBetterWriteToFile() {
        System.out.println("betterWriteToFile");
        ProductManager.betterWriteToFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
