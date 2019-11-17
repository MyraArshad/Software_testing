/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

import java.sql.ResultSet;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author maleeha
 */
public class organizationNGTest {
    
    public organizationNGTest() {
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
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        String o = "10";
        String n = "organization";
        String a = "Lahore";
        String f = "John";
        String d = "2019";
        String p = "03204587123";
        organization expResult = null;
        organization result = organization.getInstance(o, n, a, f, d, p);
        assertEquals(result, expResult);
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        organization instance = new organization();
        instance.add();
      
    }

    @Test
    public void testSelecting() {
        System.out.println("Selecting");
        organization instance = new organization();
        ResultSet expResult = null;
        ResultSet result = instance.Selecting();
        assertEquals(result, expResult);
        
    }


    @Test
    public void testAdress() {
        System.out.println("adress");
        String id = "1";
        String update = "Islamambad";
        organization instance = new organization();
        boolean expResult = false;
        boolean result = instance.adress(id, update);
        assertEquals(result, expResult);
    }

    @Test
    public void testPhone() {
        System.out.println("phone");
        String id = "0";
        String update = "01546541";
        organization instance = new organization();
        boolean expResult = false;
        boolean result = instance.phone(id, update);
        assertEquals(result, expResult);
       
    }    
}
