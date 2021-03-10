/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productmanager;
import java.sql.*;


public class SQLManager {
    
    static String myDriver = "java.sql.Driver";
    static String myUrl = "jdbc:mysql://localhost:3306/mysql";
    // this goes into methods
//    Class.forName(myDriver);
    
    static String thePassword = Secrets.getPass();
    static String theUser = "root";
    
    // this needs to go into methods
//    Connection conn = DriverManager.getConnection(myUrl, theUser, thePassword);
//    Statement st = conn.createStatement();
    
    public static void addToDatabase (String name, String description, double price, int quantity){
        try{
            Class.forName(myDriver);  
            Connection conn = DriverManager.getConnection(myUrl, theUser, thePassword);
            Statement st = conn.createStatement();
            
            String values = String.format("('%s', '%s', %.2f, %d);", name, description, price, quantity);

          
            st.executeUpdate("INSERT INTO ProductTable (productName, productDescription, productPrice, productQuantity) VALUES " + values);
            conn.close();
        }
        catch (Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());  
        }
        
        
    }
//    public static void main(String[] args){
//        try {
//            // create a mysql database connection
//            String myDriver = "java.sql.Driver";
//            
//            String myUrl = "jdbc:mysql://localhost:3306/mysql";
//            Class.forName(myDriver);
//      
//            String thePassword = Secrets.getPass();
//            String theUser = "root";
//            Connection conn = DriverManager.getConnection(myUrl, theUser, thePassword);
//
//            Statement st = conn.createStatement();
//
//            // note that i'm leaving "date_created" out of this insert statement
//            st.executeUpdate("INSERT INTO ProductTable (productName, productDescription, productPrice, productQuantity) "
//                +"VALUES ('Cup', 'For tea', 17.99, 1000)");
//
//            conn.close();
//        }
//    catch (Exception e) {
//        System.err.println("Got an exception!");
//        System.err.println(e.getMessage());
//    }
//  }
}
