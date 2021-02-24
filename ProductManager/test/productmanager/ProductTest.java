/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productmanager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nation
 */
public class ProductTest {
    
    public ProductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setProductName method, of class Product.
     */
    @Test
    public void testSetProductName() {
        System.out.println("* ProductTest: testSetProductName()");
        
        Product test = new Product(1, "test", "desc", 2.2, 3);
        
        test.setProductName("name");
        assertEquals("name" , test.getProductName());
        
        test.setProductName("New");
        assertEquals("New" , test.getProductName());
     
        test.setProductName("A Good Test");
        assertEquals("A Good Test" , test.getProductName());
    }

    /**
     * Test of getProductName method, of class Product.
     */
    @Test
    public void testGetProductName() {
        System.out.println("* ProductTest: testGetProductName()");
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);
        
        assertEquals("getName" , test.getProductName());
    }

    /**
     * Test of setProductDescription method, of class Product.
     */
    @Test
    public void testSetProductDescription() {
        System.out.println("* ProductTest: testSetProductDescription()");
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);
        
        test.setProductDescription("Disco");
        assertEquals("Disco" , test.getProductDescription());
    }

    /**
     * Test of getProductDescription method, of class Product.
     */
    @Test
    public void testGetProductDescription() {
        System.out.println("* ProductTest: testGetProductDescription()");
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);

        assertEquals("desc" , test.getProductDescription());
    }

    /**
     * Test of setProductPrice method, of class Product.
     */
    @Test
    public void testSetProductPrice() {
        System.out.println("* ProductTest: testSetProductPrice()");
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);

        test.setProductPrice(12.99);
        assertEquals(12.99 , test.getProductPrice(), 0);
    }

    /**
     * Test of getProductPrice method, of class Product.
     */
    @Test
    public void testGetProductPrice() {
        System.out.println("* ProductTest: testGetProductPrice()");
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);

        assertEquals(2.2 , test.getProductPrice(), 0);
    }

    /**
     * Test of setProductQuantity method, of class Product.
     */
    @Test
    public void testSetProductQuantity() {
        System.out.println("* ProductTest: testSetProductQuantity()");
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);
        
        test.setProductQuantity(382);
        assertEquals(382, test.getProductQuantity());
    }

    /**
     * Test of getProductQuantity method, of class Product.
     */
    @Test
    public void testGetProductQuantity() {
        System.out.println("* ProductTest: testGetProductQuantity()");
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);
        
        assertEquals(3, test.getProductQuantity());
    }

    /**
     * Test of setProductID method, of class Product.
     */
    @Test
    public void testSetProductID() {
        System.out.println("* ProductTest: testSetProductID()");
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);
        
        test.setProductID(13);
        assertEquals(13, test.getProductID());
    }

    /**
     * Test of getProductID method, of class Product.
     */
    @Test
    public void testGetProductID() {
        System.out.println("* ProductTest: testGetProductID()");
        
        Product test = new Product(1, "getName", "desc", 2.2, 3);
        
        assertEquals(1, test.getProductID());
    }

    
}
