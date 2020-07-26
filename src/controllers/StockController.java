/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entity.Product;
import entity.Stock;
import java.sql.Date;
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
public class StockController {
    //initialisation

    private Product product = ModelFactory.getInstance().getProductEntity();
    private Stock stock = ModelFactory.getInstance().getStockEntity();
    private StockModel stockModel = ModelFactory.getInstance().getStockModel();
    private boolean response;
    private static StockController instance;

    public DefaultTableModel index(JTable table) {
        // Recherche Tout
        ArrayList<Stock> listStocks = this.stockModel.findAll();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList data = new ArrayList();

        for (Stock listpStock : listStocks) {

            data.add(listpStock.getLibelle());
            data.add(listpStock.getDate());
            data.add(listpStock.getQuantiteEntrant());
            data.add(listpStock.getCuEntrant());
            data.add(listpStock.getCtEntant());
            data.add(listpStock.getQuantiteSortant());
           data.add(listpStock.getCuSortant());
           data.add(listpStock.getCtSorttant());
            data.add(listpStock.getStockDisponible());
            data.add(listpStock.getProduct().getDesignation());

        }
        model.addRow(data.toArray());

        return model;
    }

    // Insertion
    public boolean create(JTextField libeleField, JTextField QteEtrantField, JTextField cuEtrantField, JTextField QteSortantField, JTextField cuSortantField, JComboBox productIdCmbo, JTextField datefield) {
        double cout_unitaire_entrant = Double.parseDouble(cuEtrantField.getText());
        double cout_unitaire_sorant = Double.parseDouble(cuSortantField.getText());
        int quantite_entrant = Integer.parseInt(QteEtrantField.getText());
        int quantite_sorant = Integer.parseInt(QteSortantField.getText());

        this.stock.setLibelle(libeleField.getText());
        this.stock.setQuantiteEntrant(quantite_entrant);
        this.stock.setQuantiteSortant(quantite_sorant);

        // ON calcul le stock disponible
        this.stock.setStockDisponible(Double.valueOf(quantite_entrant - quantite_sorant));
        this.stock.setCtEntant(quantite_entrant * cout_unitaire_entrant);
        this.stock.setCtSorttant(quantite_sorant * cout_unitaire_sorant);

        this.product = ModelFactory.getInstance().getProductModel().find(Integer.parseInt(productIdCmbo.getSelectedItem().toString()));
        this.stock.setProduct(product);
        this.stock.setDate(Date.valueOf(datefield.getText()).toLocalDate());

        response = this.stockModel.insert(stock);
        if (response) {
            JOptionPane.showMessageDialog(null, "Insertion a bien reussi");
            this.reset(libeleField, QteEtrantField, cuEtrantField, QteSortantField, cuSortantField, productIdCmbo, datefield);
        } else {
            JOptionPane.showMessageDialog(null, "Insertion a bien reussi");
             this.reset(libeleField, QteEtrantField, cuEtrantField, QteSortantField, cuSortantField, productIdCmbo, datefield);
        }
        return true;
    }
    //MISE A JOUR

    public boolean edit(JTextField libeleField, JTextField QteEtrantField, JTextField cuEtrantField, JTextField QteSortantField, JTextField cuSortantField, JComboBox productIdCmbo, JTextField datefield,JTextField idField) {
        this.stock = ModelFactory.getInstance().getStockModel().find(Integer.parseInt(idField.getText()));
        double cout_unitaire_entrant = Double.parseDouble(cuEtrantField.getText());
        double cout_unitaire_sorant = Double.parseDouble(cuSortantField.getText());
        int quantite_entrant = Integer.parseInt(QteEtrantField.getText());
        int quantite_sorant = Integer.parseInt(QteSortantField.getText());

        this.stock.setLibelle(libeleField.getText());
        this.stock.setQuantiteEntrant(quantite_entrant);
        this.stock.setQuantiteSortant(quantite_sorant);

        // ON calcul le stock disponible
        this.stock.setStockDisponible(Double.valueOf(quantite_entrant - quantite_sorant));
        this.stock.setCtEntant(quantite_entrant * cout_unitaire_entrant);
        this.stock.setCtSorttant(quantite_sorant * cout_unitaire_sorant);

        this.product = ModelFactory.getInstance().getProductModel().find(Integer.parseInt(productIdCmbo.getSelectedItem().toString()));
        this.stock.setProduct(product);
        this.stock.setDate(Date.valueOf(datefield.getText()).toLocalDate());

        response = this.stockModel.update(stock);
        if (response) {
            JOptionPane.showMessageDialog(null, "Modification  a bien reussi");
             this.reset(libeleField, QteEtrantField, cuEtrantField, QteSortantField, cuSortantField, productIdCmbo, datefield);
        } else {
            JOptionPane.showMessageDialog(null, "Modification n'a pas reussi");
             this.reset(libeleField, QteEtrantField, cuEtrantField, QteSortantField, cuSortantField, productIdCmbo, datefield);
        }
        return true;
    }

    //SUPPRESSION
    public boolean delete(JTextField FielId) {
         this.stock = ModelFactory.getInstance().getStockModel().find(Integer.parseInt(FielId.getText()));

        response = ModelFactory.getInstance().getProductModel().delete(this.stock .getId());
        if (response) {
            JOptionPane.showMessageDialog(null, "La Supression  a bien reussi");
        } else {
            JOptionPane.showMessageDialog(null, "La suppression a bien reussi");
        }
        return true;
    }

    public void reset(JTextField libeleField, JTextField QteEtrantField, JTextField cuEtrantField, JTextField QteSortantField, JTextField cuSortantField, JComboBox productIdCmbo, JTextField datefield) {
        libeleField.setText("");
        QteEtrantField.setText("");
        cuEtrantField.setText("");
        QteSortantField.setText("");
        cuSortantField.setText("");
        productIdCmbo.removeAllItems();
        datefield.setText("");
    }

    // INSTANCE 
    public static StockController getInstance() {
        if (instance == null) {
            instance = new StockController();

        }
        return instance;
    }
}
