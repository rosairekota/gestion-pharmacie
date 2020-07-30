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

/**
 *
 * @author Nsat04
 */
public class ProductModel  extends ModelFactory implements ModelInterface<Product> {

    @Override
    public Product find(int id) {
        Product product=new Product();
        try {
            
            this.preparedStatement=Database.statement("SELECT * FROM product WHERE id=?");
            this.preparedStatement.setInt(1, id);
            this.preparedStatement.execute();
            this.resultSet=this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {                
                product.setId(this.resultSet.getInt("id"));
                product.setDesignation(this.resultSet.getString("designation"));
                product.setPrixAchat(this.resultSet.getDouble("prix_achat"));
                product.setIndice(this.resultSet.getDouble("prix_achat"));
//                Stock stock=this.getStockModel().find(this.resultSet.getInt("stock_id"));       
//                product.setStock(stock);
                return product;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList findAll() {
        ArrayList<Product>productlist=new ArrayList<>();
        Product product=new Product();
        try {
            
            this.preparedStatement=Database.statement("SELECT * FROM product");
            this.resultSet=this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {                
                product.setId(this.resultSet.getInt("id"));
                product.setDesignation(this.resultSet.getString("designation"));
                product.setPrixAchat(this.resultSet.getDouble("prix_achat"));
                product.setIndice(this.resultSet.getDouble("indice"));
                
                productlist.add(product);
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productlist;
    }

    @Override
    public String findByName(Product name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Product table) {
           
        try {
            
            this.preparedStatement=Database.statement("INSERT INTO product SET id=?, designation=?, prix_achat=?,indice=?");
            this.preparedStatement.setInt(1, table.getId());
            this.preparedStatement.setString(2, table.getDesignation());
            this.preparedStatement.setDouble(3, table.getPrixAchat());
            this.preparedStatement.setDouble(4, table.getIndice()); 
            this.preparedStatement.execute();
            
            this.nombreLignes=this.preparedStatement.executeUpdate();
            if (this.nombreLignes>0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Product table) {
           
        try {
            
            this.preparedStatement=Database.statement("UPDATE  product SET id=?, title=?, stock_id=? WHERE id=?");
            this.preparedStatement.setInt(1, table.getId());
            this.preparedStatement.setString(2, table.getDesignation());
            this.preparedStatement.setDouble(3, table.getPrixAchat());
            this.preparedStatement.setDouble(4, table.getIndice()); 
            this.preparedStatement.setInt(5, table.getId());
            this.preparedStatement.execute();
            
            this.nombreLignes=this.preparedStatement.executeUpdate();
            if (this.nombreLignes>0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            
            this.preparedStatement=Database.statement("DELETE FROM product WHERE id=?");
            this.preparedStatement.setInt(1, id);
            
            this.preparedStatement.execute();
            
            this.nombreLignes=this.preparedStatement.executeUpdate();
            if (this.nombreLignes>0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
   
    
}
