/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import databases.Database;
import entity.Product;
import entity.Vente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nsat04
 */
public class VenteMod extends ModelFactory implements ModelInterface<Vente>{
    
    ArrayList<Vente>listevente=new ArrayList<>();
    @Override
    public Vente find(int id) {
        Vente vente=this.venteEntity();
        try {
            
            this.preparedStatement=Database.statement("SELECT * FROM vente WHERE id=?");
            this.preparedStatement.setInt(1, id);
            this.preparedStatement.execute();
            this.resultSet=this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {                
                vente.setId(this.resultSet.getInt("id"));
                vente.setQuantiteVendue(this.resultSet.getInt("qte_vendue"));
                vente.setPrixVente(this.resultSet.getDouble("prix_vente"));
                vente.setValueVente(this.resultSet.getDouble("value_vente"));
                vente.setDateVente(this.resultSet.getDate("date_vente").toLocalDate());
             
                
                Product product=this.getProductModel().find(this.resultSet.getInt("product_id"));       
                vente.setProduct(product);
                return vente;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList findAll() {
       
        Vente vente = this.venteEntity();
        try {

            this.preparedStatement = Database.statement("SELECT * FROM vente");
            this.resultSet = this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {
                vente.setId(this.resultSet.getInt("id"));
                vente.setQuantiteVendue(this.resultSet.getInt("qte_vendue"));
                vente.setPrixVente(this.resultSet.getDouble("prix_vente"));
                vente.setValueVente(this.resultSet.getDouble("value_vente"));
                vente.setDateVente(this.resultSet.getDate("date_vente").toLocalDate());
              

                Product product = this.getProductModel().find(this.resultSet.getInt("product_id"));
                vente.setProduct(product);
                listevente.add(vente);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listevente;
    }

    public ArrayList findByDateVente(Vente name) {
        Vente vente=this.venteEntity();
        try {
            
            this.preparedStatement=Database.statement("SELECT * FROM vente WHERE date_vente=?");
             this.preparedStatement.setDate(1, java.sql.Date.valueOf(name.getDateVente()));
            this.preparedStatement.execute();
            this.resultSet=this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {                
                vente.setId(this.resultSet.getInt("id"));
                vente.setQuantiteVendue(this.resultSet.getInt("qte_vendue"));
                vente.setPrixVente(this.resultSet.getDouble("prix_vente"));
                vente.setValueVente(this.resultSet.getDouble("value_vente"));
                vente.setDateVente(this.resultSet.getDate("date_vente").toLocalDate());
             
                
                Product product=this.getProductModel().find(this.resultSet.getInt("product_id"));       
                vente.setProduct(product);
               listevente.add(vente);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       return listevente;
    }

    @Override
    public boolean insert(Vente table) {
        try {
            
            this.preparedStatement=Database.statement("INSERT INTO vente SET  date_vente=?, qte_vendu=?,prix_vente=?, product_id=?");
         
            this.preparedStatement.setDate(1, java.sql.Date.valueOf(table.getDateVente()));
            this.preparedStatement.setInt(2, table.getQuantiteVendue());
           
             this.preparedStatement.setDouble(3, table.getPrixVente()); 
              this.preparedStatement.setInt(4, table.getProduct().getId()); 
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
    public boolean update(Vente table) {
         try {
            
            this.preparedStatement=Database.statement("UPDATE  vente SET id=?, date_vente=?, qte_vendu=?,prix_vente=?, product_id=? WHERE id=?");
            this.preparedStatement.setInt(1, table.getId());
            this.preparedStatement.setDate(2, java.sql.Date.valueOf(table.getDateVente()));
            this.preparedStatement.setInt(3, table.getQuantiteVendue());
            this.preparedStatement.setInt(4, table.getQuantiteRestante()); 
         
            this.preparedStatement.setInt(5, table.getProduct().getId()); 
            this.preparedStatement.setInt(6, table.getId());
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
            
            this.preparedStatement=Database.statement("DELETE FROM  vente WHERE id=?");
            this.preparedStatement.setInt(1, id);
           
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
    public String findByName(Vente name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
