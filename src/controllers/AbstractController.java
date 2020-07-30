/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.GestionConge.VUE.Home_Frame;
import com.toedter.calendar.JDateChooser;
import entity.Product;
import entity.Stock;
import entity.Vente;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ModelFactory;
import model.ProductModel;
import model.StockModel;
import model.VenteMod;


/**
 *
 * @author Nsat04
 */
public abstract class AbstractController {
    // intialisation des objetc
    
    protected Product product = ModelFactory.getInstance().getProductEntity();
    protected Stock stock = ModelFactory.getInstance().getStockEntity();
    
    protected StockModel stockModel = ModelFactory.getInstance().getStockModel();
    protected ProductModel productModel =ModelFactory.getInstance().getProductModel();
    
    protected Vente vente =ModelFactory.getInstance().venteEntity();
    protected VenteMod venteModel=ModelFactory.getInstance().getVenteModel();
    protected boolean response;
    
//     public static void recuperer_Photo_Du_Login(JLabel photoLoginLabel) {
//        int largeurLabel = photoLoginLabel.getPreferredSize().width;
//        int hauteurLAbel = photoLoginLabel.getPreferredSize().height;
//
//        try {
//            LoginControleur  lc = new LoginControleur ();
//            Image img = lc.selectionImage();
//            img = img.getScaledInstance(largeurLabel, hauteurLAbel, Image.SCALE_SMOOTH);
//            photoLoginLabel.setIcon(new ImageIcon(img));
//        } catch (IOException ex) {
//            Logger.getLogger(Home_Frame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }

//    Image selectionImage() throws IOException {
//        Image image = ImageIO.read(this.getClass().getResource("/com/mariage/IMAGE/config/20180717_132549-1.jpg"));
//
//        return image;
//    }
//    
    
     public void getProducts(JComboBox produts){
             // Recherche Tout
        ArrayList<Product>listpProducts=this.productModel.getProductModel().findAll();
       
        
        
       
       
        for (Product listpProduct : listpProducts) {
            produts.addItem(listpProduct.getId());
            produts.addItem(listpProduct.getDesignation());
          
           ;
        }
       
      
      
      
    }
    public  void quitter() {
       int ok=  JOptionPane.showConfirmDialog(null, "voulez-vous quitter", "", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (ok==JOptionPane.YES_OPTION) {
           System.exit(0); 
        }
        else{
              JOptionPane.showMessageDialog(null, "veuillez vous authentifier alors ", "", JOptionPane.INFORMATION_MESSAGE); 
        }
        
    }
    
     public void reset(JTextField libeleField, JTextField QteEtrantField, JTextField cuEtrantField, JComboBox productIdCmbo, JDateChooser datefield) {
        libeleField.setText("");
        QteEtrantField.setText("");
        cuEtrantField.setText("");

        productIdCmbo.removeAllItems();
        datefield.setDate(null);
    }
    
    public  void actualiser(JTextField txtloginField, JTextField txtpwdField) {
        txtloginField.setText("");
        txtpwdField.setText("");
    }
    
    public  boolean rechercherLogin(JTextField txtloginField, JPasswordField pwdField, JDialog dialog) {
        String login = txtloginField.getText();
        String pwd = pwdField.getText();
        if (login.isEmpty() || pwd.isEmpty()) {
            JOptionPane.showMessageDialog(null, "le login ou le mot de passe est vide ,veuillez remplir toutes les cases ", "", JOptionPane.ERROR_MESSAGE);
            actualiser(txtloginField, pwdField);
            
        } else if (!login.equals("seka") || !pwd.equals("123456789")) {
            
            JOptionPane.showMessageDialog(null, "le login ou le mot de passe est est incorrect ,veuillez ressayer svp", "", JOptionPane.ERROR_MESSAGE);
            
            actualiser(txtloginField, pwdField);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Bienvenue dans notre application", "", JOptionPane.INFORMATION_MESSAGE);
            dialog.dispose();
            return true;
        }
        return false;
    }
     public void renitialiserTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
     
    
}
