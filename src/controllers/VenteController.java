/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.toedter.calendar.JDateChooser;
import entity.Product;
import entity.Stock;
import entity.Vente;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.scene.control.TreeItem;
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
public class VenteController extends AbstractController {
    //initialisation

    private static VenteController instance;

    public DefaultTableModel index(JTable table) {
        // Recherche Tout
        ArrayList<Vente> listStocks = this.venteModel.findAll();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int i = 0;

        model.setRowCount(0);

        for (Vente listpStock : listStocks) {

            Object[] data = {i, listpStock.getProduct().getDesignation(),
                listpStock.getDateVente(),
                listpStock.getProduct().getDesignation(),
                listpStock.getPrixVente(),
                listpStock.getQuantiteVendue(),
                listpStock.getQuantiteSortant()};

            model.addRow(data);
        }

        return model;
    }

    // Insertion
    public boolean create(JTextField libeleField, JTextField QteSORTANTField, JTextField cuSortantField, JComboBox productIdCmbo, JDateChooser dateventefield) {
        double cuSortant = Double.parseDouble(cuSortantField.getText());

        int quantite_sortant = Integer.parseInt(QteSORTANTField.getText());

        this.vente.setLibelle(libeleField.getText());

        // ON calcul le stock disponible
        //this.stock.setStockDisponible(Double.valueOf(quantite_entrant - quantite_sorant));
        this.vente.setValueVente(quantite_sortant * cuSortant);

        LocalDate localdate = dateventefield.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.vente.setDateVente(localdate);

        this.product = ModelFactory.getInstance().getProductModel().find(Integer.parseInt(productIdCmbo.getSelectedItem().toString()));

        // ON SELECTION LE STOCK PAR produit ==Recuperation des infos du produits
        ArrayList<Stock> listsStocks = this.stockModel.findByProduct(this.product);
        int quantityMax = 0;
        double priceCost = 0;
        LocalDate date = null;
        int id = 0;

        if (listsStocks.size() > 0) {

            for (Stock listsStock : listsStocks) {
                Integer[] allQuantity = {listsStock.getQuantiteEntrant()};
                Double[] allQuantityDisp = {listsStock.getStockDisponible()};
                Integer[] allId = {listsStock.getId()};
                for (int i = 0; i < allId.length; i++) {
                    for (int k = 0; k < allQuantityDisp.length; k++) {
                        for (int j = 0; j < allQuantity.length; j++) {
                            if (quantityMax > k) {
                                quantityMax = allQuantity[j];
                                priceCost = allQuantityDisp[k];
                                id = allId[i];
                                date = listsStock.getDate();
                                break;

                            }
                        }

                    }
                }
            }

            // MISE A JOUR DU STOCK
            this.stock.setId(id);
            this.stock.setCuSortant(cuSortant);
            this.stock.setQuantiteSortant(quantite_sortant);
            this.stock.setCtSorttant(cuSortant);
            this.stock.setStockDisponible(Double.valueOf(quantityMax - quantite_sortant));
            //this.stock.setDate(date);
            this.stock.setProduct(product);
            response = this.stockModel.update(stock);

            //--------------FIN--------------
            if (response) {
                response = this.venteModel.insert(vente);
                if (response) {
                    JOptionPane.showMessageDialog(null, "Insertion a bien reussi", null, JOptionPane.INFORMATION_MESSAGE);
                    this.reset(libeleField, QteSORTANTField, cuSortantField, productIdCmbo, dateventefield);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Insertion a echouée", null, JOptionPane.ERROR_MESSAGE);
                    this.reset(libeleField, QteSORTANTField, cuSortantField, productIdCmbo, dateventefield);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ehec de Mise a jour du stock", null, JOptionPane.ERROR_MESSAGE);
                this.reset(libeleField, QteSORTANTField, cuSortantField, productIdCmbo, dateventefield);
            }
        }
        else{
           JOptionPane.showMessageDialog(null, "Pas de stock pour ce produit", null, JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    //MISE A JOUR
    public boolean edit(JTextField stockFieldid, JTextField libeleField, JTextField QteEtrantField, JTextField cuEtrantField, JComboBox productIdCmbo, JDateChooser datefield) {
        this.stock = this.stockModel.find(Integer.parseInt(stockFieldid.getText()));
        double cout_unitaire_entrant = Double.parseDouble(cuEtrantField.getText());

        int quantite_entrant = Integer.parseInt(QteEtrantField.getText());

        this.stock.setLibelle(libeleField.getText());

        // ON calcul le stock disponible
        //this.stock.setStockDisponible(Double.valueOf(quantite_entrant - quantite_sorant));
        this.stock.setCtEntant(quantite_entrant * cout_unitaire_entrant);

        this.product = ModelFactory.getInstance().getProductModel().find(Integer.parseInt(productIdCmbo.getSelectedItem().toString()));
        this.stock.setProduct(product);
        LocalDate localdate = datefield.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.stock.setDate(localdate);

        response = this.stockModel.update(stock);
        if (response) {
            JOptionPane.showMessageDialog(null, "Insertion a bien reussi", null, JOptionPane.INFORMATION_MESSAGE);
            this.reset(libeleField, QteEtrantField, cuEtrantField, productIdCmbo, datefield);
        } else {
            JOptionPane.showMessageDialog(null, "Insertion a echouée", null, JOptionPane.ERROR_MESSAGE);
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
    public static VenteController getInstance() {
        if (instance == null) {
            instance = new VenteController();

        }
        return instance;
    }
}
