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
public class StockModel extends  AbstractModel<Stock>{

    @Override
    public Stock find(int id) {
        
          try {
            Stock stock=new Stock();
            this.preparedStatement=Database.getDatabase().prepareStatement("SELECT * FROM category WHERE id=?");
            this.preparedStatement.setInt(1, id);
            this.resultSet=this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {                
                stock.setId(this.resultSet.getInt("id"));
                stock.setPrixAchat(this.resultSet.getDouble("prix_achat"));
                
                      
      
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findByName(Stock name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Stock table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Stock table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
