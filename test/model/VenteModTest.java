/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Vente;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nsat04
 */
public class VenteModTest {
    
    public VenteModTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of find method, of class VenteMod.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        int id = 0;
        VenteMod instance = new VenteMod();
        Vente expResult = null;
        Vente result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class VenteMod.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        VenteMod instance = new VenteMod();
        ArrayList expResult = null;
        ArrayList result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByDateVente method, of class VenteMod.
     */
    @Test
    public void testFindByDateVente() {
        System.out.println("findByDateVente");
        Vente name = null;
        VenteMod instance = new VenteMod();
        ArrayList expResult = null;
        ArrayList result = instance.findByDateVente(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class VenteMod.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Vente table = null;
        VenteMod instance = new VenteMod();
        boolean expResult = false;
        boolean result = instance.insert(table);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class VenteMod.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Vente table = null;
        VenteMod instance = new VenteMod();
        boolean expResult = false;
        boolean result = instance.update(table);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class VenteMod.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        VenteMod instance = new VenteMod();
        boolean expResult = false;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByName method, of class VenteMod.
     */
    @Test
    public void testFindByName() {
        System.out.println("findByName");
        Vente name = null;
        VenteMod instance = new VenteMod();
        String expResult = "";
        String result = instance.findByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
