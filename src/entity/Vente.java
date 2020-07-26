/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Nsat04
 */
public class Vente {
    
    private int id;
   
    private String libelle;
    private int quantiteVendue;
     private int quantiteSortant;
    private LocalDate dateVente;
    private int quantiteRestante;
    private Double valueVente;
    private Double prixVente;
    private Product product;

    public Vente() {
    }

    public Vente(String libelle, int quantiteVendue, int quantiteSortant, LocalDate dateVente, int quantiteRestante, Double valueVente, Double prixVente, Product product) {
        this.libelle = libelle;
        this.quantiteVendue = quantiteVendue;
        this.quantiteSortant = quantiteSortant;
        this.dateVente = dateVente;
        this.quantiteRestante = quantiteRestante;
        this.valueVente = valueVente;
        this.prixVente = prixVente;
        this.product = product;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getQuantiteVendue() {
        return quantiteVendue;
    }

    public void setQuantiteVendue(int quantiteVendue) {
        this.quantiteVendue = quantiteVendue;
    }

    public int getQuantiteSortant() {
        return quantiteSortant;
    }

    public void setQuantiteSortant(int quantiteSortant) {
        this.quantiteSortant = quantiteSortant;
    }

    public LocalDate getDateVente() {
        return dateVente;
    }

    public void setDateVente(LocalDate dateVente) {
        this.dateVente = dateVente;
    }

    public int getQuantiteRestante() {
        return quantiteRestante;
    }

    public void setQuantiteRestante(int quantiteRestante) {
        this.quantiteRestante = quantiteRestante;
    }

    public Double getValueVente() {
        return valueVente;
    }

    public void setValueVente(Double valueVente) {
        this.valueVente = valueVente;
    }

    public Double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(Double prixVente) {
        this.prixVente = prixVente;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
}
