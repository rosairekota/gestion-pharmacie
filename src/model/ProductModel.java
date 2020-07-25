/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import databases.Database;
import entity.Product;
import entity.Stock;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.krb5.JavaxSecurityAuthKerberosAccess;

/**
 *
 * @author Nsat04
 */
public class ProductModel  extends AbstractModel<Product> {

    @Override
    public Product find(int id) {
        try {
            Product product=new Product();
            this.preparedStatement=Database.getDatabase().prepareStatement("SELECT * FROM product WHERE id=?");
            this.preparedStatement.setInt(1, id);
            this.resultSet=this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {                
                product.setId(this.resultSet.getInt("id"));
                product.setTitle(this.resultSet.getString("title"));
                
                Stock stock=this.getStock().find(this.resultSet.getInt("category_id"));       
                product.setStock(stock);
                return product;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findByName(Product name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Product table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Product table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
