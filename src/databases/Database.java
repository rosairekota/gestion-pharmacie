/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;

import entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ProductModel;

/**
 *
 * @author Nsat04
 */
public class Database {
    
    private static String user_name="root";
    
    private static String password="";
    
    private static String url="jdbc:mysql://localhost:3306/db_stock_dev";
    
    private static Connection connection=null;

   
    
    public static Connection getDatabase() throws ClassNotFoundException{
          Class.forName("com.mysql.jdbc.Driver");
        if (Database.connection==null) {
            try {

              
                Database.connection = DriverManager.getConnection(url, user_name, password);
                System.out.println("Connexion ok");
            } catch (SQLException e) {
                // TODO: handle exception
                System.out.println("Connexion esimbite  " + e);
            }
            return connection;
        }
        return  connection;
    }

    public static PreparedStatement statement(String query) throws SQLException{
        try {
           PreparedStatement ps =Database.getDatabase().prepareStatement(query);
          
           return ps;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
