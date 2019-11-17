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
public class confirm_donorsNGTest {
    
    public confirm_donorsNGTest() {
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
    public void testChkdonors() {
        System.out.println("chkdonors");
        long dcnic = 01234;
        confirm_donors instance = new confirm_donors();
        boolean expResult = false;
        boolean result = instance.chkdonors(dcnic);
        assertEquals(result, expResult);
        
    }
    
    
    @Test
    public void testChkdonors2() {
        System.out.println("chkdonors");
        long dcnic = 01234;
        confirm_donors instance = new confirm_donors();
        boolean expResult = false;
        boolean result = instance.chkdonors(dcnic);
        assertEquals(result, expResult);
        
    }
    
}
