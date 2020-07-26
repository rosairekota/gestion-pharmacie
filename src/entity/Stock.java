/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Nsat04
 */
public class Stock {
    private int id;
   
    private String libelle;
    private LocalDate date;
    private int quantiteEntrant;
    private Double cuEntrant;
    private Double ctEntant;
    private int quantiteSortant;
    private Double cuSortant;
    private Double ctSorttant;
    private Double stockDisponible;
    private Product product;

    public Stock() {
    }

    public Stock(String libelle, LocalDate date, int quantiteEntrant, Double cuEntrant, Double ctEntant, int quantiteSortant, Double cuSortant, Double ctSorttant, Double stockDisponible, Product product) {
      
        this.libelle = libelle;
        this.date = date;
        this.quantiteEntrant = quantiteEntrant;
        this.cuEntrant = cuEntrant;
        this.ctEntant = ctEntant;
        this.quantiteSortant = quantiteSortant;
        this.cuSortant = cuSortant;
        this.ctSorttant = ctSorttant;
        this.stockDisponible = stockDisponible;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantiteEntrant() {
        return quantiteEntrant;
    }

    public void setQuantiteEntrant(int quantiteEntrant) {
        this.quantiteEntrant = quantiteEntrant;
    }

    public Double getCuEntrant() {
        return cuEntrant;
    }

    public void setCuEntrant(Double cuEntrant) {
        this.cuEntrant = cuEntrant;
    }

    public Double getCtEntant() {
        return ctEntant;
    }

    public void setCtEntant(Double ctEntant) {
        this.ctEntant = ctEntant;
    }

    public int getQuantiteSortant() {
        return quantiteSortant;
    }

    public void setQuantiteSortant(int quantiteSortant) {
        this.quantiteSortant = quantiteSortant;
    }

    public Double getCuSortant() {
        return cuSortant;
    }

    public void setCuSortant(Double cuSortant) {
        this.cuSortant = cuSortant;
    }

    public Double getCtSorttant() {
        return ctSorttant;
    }

    public void setCtSorttant(Double ctSorttant) {
        this.ctSorttant = ctSorttant;
    }

    public Double getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(Double stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
 
   
    

    
}
