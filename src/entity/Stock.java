/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Nsat04
 */
public class Stock {
    private int id;
    private Double prixAchat;
    private Double prixVente;
    private Double indice;
    private int quantiteEntrant;
     private int quantiteSortant;
    private LocalDateTime dateVente;
    private int quantiteRestante;
    private Double approvisionnement;
    private Double finStock;
    
    private ArrayList<Product>listProduits;

    public Stock() {
    }

    public Stock(Double prixAchat, Double prixVente, Double indice, int quantiteEntrant, int quantiteSortant, LocalDateTime dateVente, int quantiteRestante, Double approvisionnement, Double finStock) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.indice = indice;
        this.quantiteEntrant = quantiteEntrant;
        this.quantiteSortant = quantiteSortant;
        this.dateVente = dateVente;
        this.quantiteRestante = quantiteRestante;
        this.approvisionnement = approvisionnement;
        this.finStock = finStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(Double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public Double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(Double prixVente) {
        this.prixVente = prixVente;
    }

    public Double getIndice() {
        return indice;
    }

    public void setIndice(Double indice) {
        this.indice = indice;
    }

    public int getQuantiteEntrant() {
        return quantiteEntrant;
    }

    public void setQuantiteEntrant(int quantiteEntrant) {
        this.quantiteEntrant = quantiteEntrant;
    }

    public int getQuantiteSortant() {
        return quantiteSortant;
    }

    public void setQuantiteSortant(int quantiteSortant) {
        this.quantiteSortant = quantiteSortant;
    }

    public LocalDateTime getDateVente() {
        return dateVente;
    }

    public void setDateVente(LocalDateTime dateVente) {
        this.dateVente = dateVente;
    }

    public int getQuantiteRestante() {
        return quantiteRestante;
    }

    public void setQuantiteRestante(int quantiteRestante) {
        this.quantiteRestante = quantiteRestante;
    }

    public Double getApprovisionnement() {
        return approvisionnement;
    }

    public void setApprovisionnement(Double approvisionnement) {
        this.approvisionnement = approvisionnement;
    }

    public Double getFinStock() {
        return finStock;
    }

    public void setFinStock(Double finStock) {
        this.finStock = finStock;
    }

    public ArrayList<Product> getListProduits() {
        return listProduits;
    }

    public void setListProduits(ArrayList<Product> listProduits) {
        this.listProduits = listProduits;
    }
    

    
}
