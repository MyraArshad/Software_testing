/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Husnain Rafiq
 */
public class AdminNGTest {
    
    public AdminNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getFirst method, of class Admin.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        Admin instance = new Admin();
        String expResult = "HUSNAIN";
        String result = instance.getFirst();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirst method, of class Admin.
     */
    @Test
    public void testSetFirst() {
        System.out.println("setFirst");
        String First = "ZEESHAN";
        Admin instance = new Admin();
        instance.setFirst(First);
        
    }

    /**
     * Test of getLast method, of class Admin.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        Admin instance = new Admin();
        String expResult = "RAFIQ";
        String result = instance.getLast();
        assertEquals(result, expResult);
        
    }

    /**
     * Test of setLast method, of class Admin.
     */
    @Test
    public void testSetLast() {
        System.out.println("setLast");
        String Last = "RAFIQ";
        Admin instance = new Admin();
        instance.setLast(Last);
    }

    /**
     * Test of getUSer method, of class Admin.
     */
    @Test
    public void testGetUSer() {
        System.out.println("getUSer");
        Admin instance = new Admin();
        String expResult = "HUSNAIN";
        String result = instance.getUSer();
        assertEquals(result, expResult);
    }

    /**
     * Test of setUSer method, of class Admin.
     */
    @Test
    public void testSetUSer() {
        System.out.println("setUSer");
        String USer = "ZEESHAN";
        Admin instance = new Admin();
        instance.setUSer(USer);
        
    }

    /**
     * Test of getEmail method, of class Admin.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Admin instance = new Admin();
        String expResult = "HUSNAIN@GMAIL.COM";
        String result = instance.getEmail();
        assertEquals(result, expResult);
    }

    /**
     * Test of setEmail method, of class Admin.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "HUSNAIN@GMAIL.COM";
        Admin instance = new Admin();
        instance.setEmail(email);
      
    }

    /**
     * Test of getPass method, of class Admin.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        Admin instance = new Admin();
        String expResult = "ASAD";
        String result = instance.getPass();
        assertEquals(result, expResult);
       
    }

    /**
     * Test of setPass method, of class Admin.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "noPASSjANI";
        Admin instance = new Admin();
        instance.setPass(pass);
      
    }

    /**
     * Test of find method, of class Admin.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String u = "HUSNAIN";
        String pass = "ASAD";
        Admin instance = new Admin();
        boolean expResult = true;
        boolean result = instance.find(u, pass);
        assertEquals(result, expResult);
       
    }
    
    @Test
    public void testFind2() {
        System.out.println("find");
        String u = "ZEESHAN";
        String pass = "ASAD";
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.find(u, pass);
        assertEquals(result, expResult);
       
    }

    /**
     * Test of iner method, of class Admin.
     */
    @Test
    public void testIner() {
        System.out.println("iner");
        Admin instance = new Admin();
        instance.First="MYRA";
        instance.Last="ARSHAD";
        instance.USer="MYRA";
        instance.email="MYRA@GMAIL.COM";
        instance.pass="MYRA1122";
        
        instance.iner();
        
    }
    
}
