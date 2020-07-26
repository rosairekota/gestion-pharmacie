/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Nsat04
 */
public interface ModelInterface<D> {
    
    
    public abstract D find(int id);
    
    public abstract ArrayList findAll();
    
    public abstract String findByName(D name);
    
    public abstract boolean  insert(D table);
    
    public abstract boolean  update(D table);
    
    public abstract boolean  delete(int id);
    
    
    //METHODE PROTEGEE
    
    
   

}
