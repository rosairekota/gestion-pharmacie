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
public class StockModel extends ModelFactory implements ModelInterface<Stock> {

    Stock stock = this.getStockEntity();
    ArrayList<Stock> listStocks = new ArrayList<>();

    @Override
    public Stock find(int id) {

        try {

            this.preparedStatement = Database.statement("SELECT * FROM stock WHERE id=?");
            this.preparedStatement.setInt(1, id);
            this.preparedStatement.execute();
            this.resultSet = this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {
                stock.setId(this.resultSet.getInt("id"));
                stock.setLibelle(this.resultSet.getString("libelle"));
                stock.setDate(this.resultSet.getDate("date").toLocalDate());
                stock.setQuantiteEntrant(this.resultSet.getInt("qte_entrant"));
                stock.setCuEntrant(this.resultSet.getDouble("cu_entrant"));
                stock.setCtEntant(this.resultSet.getDouble("ct_entrant"));
                stock.setQuantiteSortant(this.resultSet.getInt("qte_sortant"));
                stock.setCuSortant(this.resultSet.getDouble("cu_sortant"));
                stock.setCtSorttant(this.resultSet.getDouble("ct_sortant"));
                stock.setStockDisponible(this.resultSet.getDouble("stock_dispo"));

                stock.setProduct(this.getProductModel().find(this.resultSet.getInt("produit_id")));
                return stock;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList findAll() {
        try {

            this.preparedStatement = Database.statement("SELECT * FROM stock");

            this.preparedStatement.execute();
            this.resultSet = this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {
                stock.setId(this.resultSet.getInt("id"));
                stock.setLibelle(this.resultSet.getString("libelle"));
                stock.setDate(this.resultSet.getDate("date").toLocalDate());
                stock.setQuantiteEntrant(this.resultSet.getInt("qte_entrant"));
                stock.setCuEntrant(this.resultSet.getDouble("cu_entrant"));
                stock.setCtEntant(this.resultSet.getDouble("ct_entrant"));
                stock.setQuantiteSortant(this.resultSet.getInt("qte_sortant"));
                stock.setCuSortant(this.resultSet.getDouble("cu_sortant"));
                stock.setCtSorttant(this.resultSet.getDouble("ct_sortant"));
                stock.setStockDisponible(this.resultSet.getDouble("stock_dispo"));

                stock.setProduct(this.getProductModel().find(this.resultSet.getInt("produit_id")));
                this.listStocks.add(stock);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.listStocks;
    }

    public ArrayList findByDateStock(Stock name) {
        try {

            this.preparedStatement = Database.statement("SELECT * FROM stock WHERE date=?");
            this.preparedStatement.setDate(1, java.sql.Date.valueOf(name.getDate()));
            this.preparedStatement.execute();
            this.resultSet = this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {
                stock.setId(this.resultSet.getInt("id"));
                stock.setLibelle(this.resultSet.getString("libelle"));
                stock.setDate(this.resultSet.getDate("date").toLocalDate());
                stock.setQuantiteEntrant(this.resultSet.getInt("qte_entrant"));
                stock.setCuEntrant(this.resultSet.getDouble("cu_entrant"));
                stock.setCtEntant(this.resultSet.getDouble("ct_entrant"));
                stock.setQuantiteSortant(this.resultSet.getInt("qte_sortant"));
                stock.setCuSortant(this.resultSet.getDouble("cu_sortant"));
                stock.setCtSorttant(this.resultSet.getDouble("ct_sortant"));
                stock.setStockDisponible(this.resultSet.getDouble("stock_dispo"));

                stock.setProduct(this.getProductModel().find(this.resultSet.getInt("produit_id")));
                this.listStocks.add(stock);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.listStocks;
    }

    public ArrayList findByProductName(Stock name) {
        try {

            this.preparedStatement = Database.statement("SELECT * FROM stock WHERE designation=?");
            this.preparedStatement.setString(1, name.getProduct().getDesignation());
            this.preparedStatement.execute();
            this.resultSet = this.preparedStatement.executeQuery();
            while (this.resultSet.next()) {
                stock.setId(this.resultSet.getInt("id"));
                stock.setLibelle(this.resultSet.getString("libelle"));
                stock.setDate(this.resultSet.getDate("date").toLocalDate());
                stock.setQuantiteEntrant(this.resultSet.getInt("qte_entrant"));
                stock.setCuEntrant(this.resultSet.getDouble("cu_entrant"));
                stock.setCtEntant(this.resultSet.getDouble("ct_entrant"));
                stock.setQuantiteSortant(this.resultSet.getInt("qte_sortant"));
                stock.setCuSortant(this.resultSet.getDouble("cu_sortant"));
                stock.setCtSorttant(this.resultSet.getDouble("ct_sortant"));
                stock.setStockDisponible(this.resultSet.getDouble("stock_dispo"));

                stock.setProduct(this.getProductModel().find(this.resultSet.getInt("produit_id")));
                this.listStocks.add(stock);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.listStocks;
    }

    @Override
    public String findByName(Stock name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Stock table) {
        try {

            this.preparedStatement = Database.statement("INSERT INTO stock SET id=?, libelle=?, date=?, qte_entrant=?,cu_entrant=?,ct_entrant=?,qte_sortant=?, cu_sortant=?, ct_sortant=?,stock_dispo=?,"
                    + ", produit_id=?");
            this.preparedStatement.setInt(1, table.getId());
            this.preparedStatement.setString(2, table.getLibelle());
            this.preparedStatement.setDate(3, java.sql.Date.valueOf(table.getDate()));
            this.preparedStatement.setDouble(4, table.getQuantiteEntrant());
            this.preparedStatement.setDouble(5, table.getCuEntrant());
            this.preparedStatement.setDouble(6, table.getCtEntant());
            this.preparedStatement.setInt(7, table.getQuantiteSortant());
            this.preparedStatement.setDouble(8, table.getCuSortant());
            this.preparedStatement.setDouble(9, table.getCtSorttant());
            this.preparedStatement.setDouble(10, table.getStockDisponible());
            this.preparedStatement.setInt(11, table.getProduct().getId());
            this.preparedStatement.execute();

            this.nombreLignes = this.preparedStatement.executeUpdate();
            if (this.nombreLignes == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Stock table) {
        try {

            this.preparedStatement = Database.statement("UPDATE  stock SET id=?, libelle=?, date=?, qte_entrant=?,cu_entrant=?,ct_entrant=?,qte_sortant=?, cu_sortant=?, ct_sortant=?,stock_dispo=?,"
                    + ", produit_id=? WHERE id=?");
            this.preparedStatement.setInt(1, table.getId());
            this.preparedStatement.setString(2, table.getLibelle());
            this.preparedStatement.setDate(3, java.sql.Date.valueOf(table.getDate()));
            this.preparedStatement.setDouble(4, table.getQuantiteEntrant());
            this.preparedStatement.setDouble(5, table.getCuEntrant());
            this.preparedStatement.setDouble(6, table.getCtEntant());
            this.preparedStatement.setInt(7, table.getQuantiteSortant());
            this.preparedStatement.setDouble(8, table.getCuSortant());
            this.preparedStatement.setDouble(9, table.getCtSorttant());
            this.preparedStatement.setDouble(10, table.getStockDisponible());
            this.preparedStatement.setInt(11, table.getProduct().getId());
            this.preparedStatement.setInt(12, table.getId());
            this.preparedStatement.execute();

            this.nombreLignes = this.preparedStatement.executeUpdate();
            if (this.nombreLignes == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {

            this.preparedStatement = Database.statement("DELETE FROM  stock WHERE id=?");
            this.preparedStatement.setInt(1, id);

            this.preparedStatement.execute();

            this.nombreLignes = this.preparedStatement.executeUpdate();
            if (this.nombreLignes == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
