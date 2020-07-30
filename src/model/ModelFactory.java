/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Product;
import entity.Stock;
import entity.Vente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Nsat04
 */
public class ModelFactory {
    
    protected PreparedStatement preparedStatement;
    protected ResultSet resultSet;
    protected int nombreLignes;
    
    // les proprietes du DAO
    private ProductModel productModel=null;
    private StockModel stockModel=null;
    private VenteMod venteModel=null;
    
    // les attributs des entites
   
      private Product product=null;
      private Stock stock=null;
      
      private Vente vente=null;
      
    // instace de la classes
     protected static ModelFactory instance=null;
     
     
     // initialisation des nos instances (PATTERN SINGLETON)
     
    public static ModelFactory getInstance(){
        if (instance==null) {
            instance=new ModelFactory();
            
        }
        return instance;
    }
    
    // initialisation 
    
    /**
     * ceci retourne une instance de la classe Product:
     * C'est utilisatrion du pattern Singleton
     * @return new Product()
     */
     public Product getProductEntity(){
         if (ModelFactory.getInstance().product==null) {
             ModelFactory.getInstance().product=new Product();
         }
         return ModelFactory.getInstance().product;
    }
     /**
     * ceci retourne une instance de la classe ProductModel:
     * C'est utilisatrion du pattern Singleton
     * @return new ProductModel()
     */
     public ProductModel getProductModel(){
         if (ModelFactory.getInstance().productModel==null) {
             ModelFactory.getInstance().productModel=new ProductModel();
         }
         return ModelFactory.getInstance().productModel;
    }
    
     /**
     * ceci retourne une instance de la classe Stock:
     * C'est utilisatrion du pattern Singleton
     * @return new Stock()
     */
     public Stock getStockEntity() {
        if (ModelFactory.getInstance().stock==null) {
             ModelFactory.getInstance().stock=new Stock();
         }
         return ModelFactory.getInstance().stock;
    }
     
     /**
     * ceci retourne une instance de la classe StockModel:
     * C'est utilisatrion du pattern Singleton
     * @return new StockModel()
     */
     public StockModel getStockModel() {
        if (ModelFactory.getInstance().stockModel==null) {
             ModelFactory.getInstance().stockModel=new StockModel();
         }
         return ModelFactory.getInstance().stockModel;
    }
     
      /**
     * ceci retourne une instance de la classe VenteModel:
     * C'est utilisatrion du pattern Singleton
     * @return new venteModel()
     **/
      public VenteMod getVenteModel(){
         if (ModelFactory.getInstance().venteModel==null) {
             ModelFactory.getInstance().venteModel=new VenteMod();
         }
         return ModelFactory.getInstance().venteModel;
    }
    
     /**
     * ceci retourne une instance de la classe VenteModel:
     * C'est utilisatrion du pattern Singleton
     * @return new venteModel()
     **/
     public Vente venteEntity() {
        if (ModelFactory.getInstance().vente==null) {
             ModelFactory.getInstance().vente=new Vente();
         }
         return ModelFactory.getInstance().vente;
    }
}
