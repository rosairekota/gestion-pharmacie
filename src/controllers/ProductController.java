/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entity.Product;
import entity.Stock;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.ModelFactory;

/**
 *
 * @author Nsat04
 */
public class ProductController {
    
   //initialisation
     private  Product product=ModelFactory.getInstance().getProductEntity();
     private  Stock stock=ModelFactory.getInstance().getStockEntity();
     private boolean response;
     private static ProductController instance;
      
      
    public DefaultTableModel index(JTable table){
             // Recherche Tout
        ArrayList<Product>listpProducts=ModelFactory.getInstance().getProductModel().findAll();
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        
        
       
        ArrayList data=new ArrayList();
        for (Product listpProduct : listpProducts) {
            data.add(listpProduct.getDesignation());
            data.add(listpProduct.getPrixAchat());
            data.add(listpProduct.getIndice());
           ;
        }
       
       model.addRow(data.toArray());
        return model;
      
    }
    
     // Insertion
    
    public boolean create(JTextField designationField,JTextField prixAchatField,JComboBox indiceCmbo){
      
   
      product.setDesignation(designationField.getText());
      product.setPrixAchat(Double.parseDouble(prixAchatField.getText()));
      product.setIndice(Integer.parseInt(""+indiceCmbo.getSelectedItem()));
     
       response=ModelFactory.getInstance().getProductModel().insert(product);
        if (response) {
            JOptionPane.showMessageDialog(null, "Insertion a bien reussi");
            this.reset(designationField,prixAchatField,indiceCmbo,null);
        }     
        else{
             JOptionPane.showMessageDialog(null, "Insertion a bien reussi");
             this.reset(designationField,prixAchatField,indiceCmbo,null);
        }
       return true;
}    
        //MISE A JOUR
  
  public boolean edit(JTextField designationField,JTextField prixAchatField,JComboBox indiceCmbo,JTextField idField){
       product = ModelFactory.getInstance().getProductModel().find(Integer.parseInt(idField.getText()));
       product.setDesignation(designationField.getText());
       product.setPrixAchat(Double.parseDouble(prixAchatField.getText()));
       product.setIndice(Integer.parseInt(""+indiceCmbo.getSelectedItem()));
       response = ModelFactory.getInstance().getProductModel().update(product);
     if (response) {
            JOptionPane.showMessageDialog(null, "Modification  a bien reussi");
        }     
        else{
             JOptionPane.showMessageDialog(null, "Modification a bien reussi");
        }
       return true;
  }
        
        
 //SUPPRESSION
 public boolean delete(JTextField FielId){
             Product prods=ModelFactory.getInstance().getProductModel().find(Integer.parseInt(FielId.getText()));
       
         response=ModelFactory.getInstance().getProductModel().delete(prods.getId());
       if (response) {
            JOptionPane.showMessageDialog(null, "La Supression  a bien reussi");
        }     
        else{
             JOptionPane.showMessageDialog(null, "La suppression a bien reussi");
        }
       return true;
 }

 
 public void reset (JTextField designationField,JTextField prixAchatField,JComboBox indiceCmbo,JTextField idField){
     designationField.setText("");
     prixAchatField.setText("");
     indiceCmbo.removeAllItems();
     idField.setText("");
 }
 
 // INSTANCE 
  public static ProductController getInstance(){
      if (instance==null) {
          instance=new ProductController();
         
      }
       return instance;
  }
}
