/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Nsat04
 */
public class Product {
    
    private int id;
    private String designation;
    private double prixAchat;
    private double indice;
  

    public Product() {
    }

    public Product(String designation, double prixAchat, double indice) {
        this.designation = designation;
        this.prixAchat = prixAchat;
        this.indice = indice;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

   
    
    
    
}
