/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

import java.util.ArrayList;
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
public class ProjectClassNGTest {
    
    
    
    public ProjectClassNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("After Method");
    }

    @Test
    public void testViewCollectedMOney() {
        System.out.println("viewCollectedMOney");
        ProjectClass instance = new ProjectClass();
        instance.viewCollectedMOney();

        
    }

    @Test(priority=0)
    public void testGetPID() {
        System.out.println("getPID");
        ProjectClass instance = new ProjectClass();
        int expResult = 13;
        int result = instance.getPID();
        assertEquals(result, expResult);
        
        
    }

    @Test(priority=1)
    public void testGetMoney() {
        System.out.println("getMoney");
        ProjectClass instance = new ProjectClass();
        String expResult = "2500000";
        String result = instance.getMoney();
        assertEquals(result, expResult);
        
    }

    @Test(priority=2)
    public void testGetN() {
        System.out.println("getN");
        ProjectClass instance = new ProjectClass();
        String expResult = "Myra1";
        String result = instance.getN();
        assertEquals(result, expResult);
        
        
    }

   @Test(priority=3)
    public void testAdd() {
        System.out.println("add");
        ProjectClass instance = new ProjectClass();
        instance.add();
       
       
    }

    @Test(priority=4,dependsOnMethods = {"testAdd"})
    public void testDelete() {
        System.out.println("delete");
        int id = 13;
        ProjectClass instance = new ProjectClass();
        boolean expResult = false;
        boolean result = instance.delete(id);
        assertEquals(result, expResult);
        
    }
   @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 1;
        String m = "Myra";
        ProjectClass instance = new ProjectClass();
        boolean expResult = false;
        boolean result = instance.update(1, "Myra");
        assertEquals(result, expResult);
       
       
    }
    @Test(priority=0)
    public void testAssignID() {
        System.out.println("assignID");
        ProjectClass instance = new ProjectClass();
        int expResult = 1;
        int result = instance.assignID();
        assertEquals(result, expResult);
        
        
    }

    
    @Test(priority=2)
    public void testFetchname() {
        System.out.println("fetchname");
        int aa = 0;
        ProjectClass instance = new ProjectClass();
        String expResult = "Donated";
        String result = instance.fetchname(aa);
        assertEquals(result, expResult);
       
    }  
}
