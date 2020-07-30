/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.toedter.calendar.JDateChooser;
import entity.Product;
import entity.Stock;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ModelFactory;
import model.StockModel;

/**
 *
 * @author Nsat04
 */
public class StockController extends AbstractController{
    //initialisation

   
    private static StockController instance;

    public DefaultTableModel index(JTable table) {
        // Recherche Tout
        ArrayList<Stock> listStocks = this.stockModel.findAll();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int i = 0;

        model.setRowCount(0);
        
        for (Stock listpStock : listStocks) {

            Object[] data = {i, listpStock.getProduct().getDesignation(),
                listpStock.getDate(),
                listpStock.getQuantiteEntrant(),
                listpStock.getCuEntrant(),
                listpStock.getCtEntant(),
                listpStock.getQuantiteSortant(),
                listpStock.getCuSortant(),
                listpStock.getCtSorttant(),
                listpStock.getStockDisponible()};

            model.addRow(data);
        }

        return model;
    }

    // Insertion
    public boolean create(JTextField libeleField, JTextField QteEtrantField, JTextField cuEtrantField,JComboBox productIdCmbo, JDateChooser datefield) {
        double cout_unitaire_entrant = Double.parseDouble(cuEtrantField.getText());
       
        int quantite_entrant = Integer.parseInt(QteEtrantField.getText());
     

        this.stock.setLibelle(libeleField.getText());
       

        // ON calcul le stock disponible
        //this.stock.setStockDisponible(Double.valueOf(quantite_entrant - quantite_sorant));
        this.stock.setCtEntant(quantite_entrant * cout_unitaire_entrant);
      

        this.product = ModelFactory.getInstance().getProductModel().find(Integer.parseInt(productIdCmbo.getSelectedItem().toString()));
        this.stock.setProduct(product);
        LocalDate localdate=datefield.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.stock.setDate(localdate);

        response = this.stockModel.insert(stock);
        if (response) {
            JOptionPane.showMessageDialog(null, "Insertion a bien reussi",null,JOptionPane.INFORMATION_MESSAGE);
            this.reset(libeleField, QteEtrantField, cuEtrantField, productIdCmbo, datefield);
        } else {
            JOptionPane.showMessageDialog(null, "Insertion a echouée",null,JOptionPane.ERROR_MESSAGE);
             this.reset(libeleField, QteEtrantField, cuEtrantField, productIdCmbo, datefield);
        }
        return true;
    }
    //MISE A JOUR

    public boolean edit(JTextField stockFieldid,JTextField libeleField, JTextField QteEtrantField, JTextField cuEtrantField,JComboBox productIdCmbo, JDateChooser datefield) {
       this.stock=this.stockModel.find(Integer.parseInt(stockFieldid.getText()));
        double cout_unitaire_entrant = Double.parseDouble(cuEtrantField.getText());
       
        int quantite_entrant = Integer.parseInt(QteEtrantField.getText());
     

        this.stock.setLibelle(libeleField.getText());
       

        // ON calcul le stock disponible
        //this.stock.setStockDisponible(Double.valueOf(quantite_entrant - quantite_sorant));
        this.stock.setCtEntant(quantite_entrant * cout_unitaire_entrant);
      

        this.product = ModelFactory.getInstance().getProductModel().find(Integer.parseInt(productIdCmbo.getSelectedItem().toString()));
        this.stock.setProduct(product);
        LocalDate localdate=datefield.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.stock.setDate(localdate);

        response = this.stockModel.update(stock);
        if (response) {
            JOptionPane.showMessageDialog(null, "Insertion a bien reussi",null,JOptionPane.INFORMATION_MESSAGE);
            this.reset(libeleField, QteEtrantField, cuEtrantField, productIdCmbo, datefield);
        } else {
            JOptionPane.showMessageDialog(null, "Insertion a echouée",null,JOptionPane.ERROR_MESSAGE);
             this.reset(libeleField, QteEtrantField, cuEtrantField, productIdCmbo, datefield);
        }
        return true;
    }

    //SUPPRESSION
    public boolean delete(JTextField FielId) {
        this.stock = ModelFactory.getInstance().getStockModel().find(Integer.parseInt(FielId.getText()));

        response = ModelFactory.getInstance().getProductModel().delete(this.stock.getId());
        if (response) {
            JOptionPane.showMessageDialog(null, "La Supression  a bien reussi");
        } else {
            JOptionPane.showMessageDialog(null, "La suppression a bien reussi");
        }
        return true;
    }

    

    // INSTANCE 
    public static StockController getInstance() {
        if (instance == null) {
            instance = new StockController();

        }
        return instance;
    }
}
