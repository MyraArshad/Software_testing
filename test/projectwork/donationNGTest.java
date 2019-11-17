
package projectwork;

import java.util.ArrayList;
import java.util.List;
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
public class donationNGTest {
    
    public donationNGTest() {
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
    public void testGetid() {
        System.out.println("getid");
        donation instance = new donation();
        int expResult = 321;
        int result = instance.getid();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testType() {
        System.out.println("type");
        donation instance = new donation();
        String expResult = "money";
        String result = instance.type();
        assertEquals(result, expResult);
    }

    @Test
    public void testDonor() {
        System.out.println("donor");
        donation instance = new donation();
        String expResult = "xyz";
        String result = instance.donor();
        assertEquals(result, expResult);
        
    }

    
    @Test
    public void testGetamount() {
        System.out.println("getamount");
        donation instance = new donation();
        int expResult = 100000;
        int result = instance.getamount();
        assertEquals(result, expResult);
       
    }

  
    @Test
    public void testDonated() {
        System.out.println("donated");
        donation instance = new donation();
        int expResult = 1;
        int result = instance.donated();
        assertEquals(result, expResult);
        
    }

  
    @Test
    public void testGetdate() {
        System.out.println("getdate");
        donation instance = new donation();
        String expResult = "25-5-219";
        String result = instance.getdate();
        assertEquals(result, expResult);
        
    }

    
    @Test
    public void testIs_number_valid() {
        System.out.println("Is_number_valid");
        String s = "8";
        donation instance = new donation();
        boolean expResult = true;
        boolean result = instance.Is_number_valid(s);
        assertEquals(result, expResult);
       
    }

    /*@Test
    public void testCheck() {
        System.out.println("check");
        String s = "3214569874123";
        donation instance = new donation();
        String expResult = "3214569874123";
        String result = instance.check(s);
        assertEquals(result, expResult);
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        donation instance = new donation();
        instance.add();
       
    }

    @Test
    public void testDeleteproj() {
        System.out.println("deleteproj");
        int id = 2;
        donation instance = new donation();
        instance.deleteproj(id);
        
    }

    @Test
    public void testDeleteDonor() {
        System.out.println("deleteDonor");
        String id = "3214569874123";
        donation instance = new donation();
        instance.deleteDonor(id);
        
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 2;
        donation instance = new donation();
        instance.delete(id);
    }
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 2;
        int amount = 2500;
        donation instance = new donation();
        instance.update(id, amount);
       
    }

    @Test
    public void testGetHistory() {
        System.out.println("getHistory");
        List expResult = new ArrayList();
        expResult.add("edhi proj 1");
        List result = donation.getHistory();
        assertEquals(result, expResult);
        
    }*/
    
}
