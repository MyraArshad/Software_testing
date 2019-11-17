/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

/**
 *
 * @author Dell
 */
public class confirm_donors {
    private database obj;

    public confirm_donors() {
        obj=new database();
    }
    public boolean chkdonors(long dcnic){
        boolean result=false;
        result=obj.checkDonors(dcnic);
        
        return result;
    
    
    
    }
    
    
}
