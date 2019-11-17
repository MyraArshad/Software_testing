/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

import java.util.*;
import static jdk.nashorn.internal.codegen.types.Type.generic;

/**
 *
 * @author CIT
 */
public class donation {
     int id;
     public String type;
     public String donor;
     public int amount; //number of gifts in case of gifts and amount incase of cash
     public int donated_to;
     public String date;
    
    donation(){
        id=321;
        type="money";
        donor="xyz";
        amount=0;
        donated_to=5;
        date="12-9-12";
    }
    donation(int num,String t,String d,int a,int dona,String dat){
        id=num;
        type=t;
        donor=d;
        amount=a;
        donated_to=dona;
        date=dat;
    }
    int getid(){
        return 321;
    }
    String type(){
        return "money";
    }
    String donor(){
        return "xyz";
    }
    int getamount(){
        return 100000;
    }
    int donated(){
        return 1;
    }
    String getdate(){
        return "25-5-219";
    }
    public boolean Is_number_valid(String s){
     
        if(s.isEmpty())   return false;
        if(s.length()==1 && s.charAt(0)=='.')  {return false;} 
        
        //Language restricted to numbers, operators, brackets and (.) only
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == ' ') {                
                return false;
            }
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9' )
            {continue;}
            else 
            {return false;}
        }
        return true;
    }
    
    String check(String s){
        dbConnectivity db= new dbConnectivity();
        String s1=db.check(s);
        return s1;
    }
    void add(){
        
        dbConnectivity db=new dbConnectivity();
        db.addData(this);
    }
    void deleteproj(int id)
    {
        String s="delete from donate where donated_to= "+id;
        dbConnectivity db= new dbConnectivity();
        db.deleteData(s);
    }
    void deleteDonor(String id){
        String s="delete from donate where donor = '"+id+"'";
        dbConnectivity db= new dbConnectivity();
        db.deleteData(s);
    
    }
    void delete(int id){
        
        dbConnectivity db=new dbConnectivity();
           String s= "delete from donate where id="+id;
           db.deleteData(s);
    }
    void update(int id,int amount){                                         //updates amount
        String s= "update donate set amount="+amount+ "where id="+id;
        dbConnectivity db=new dbConnectivity();
        db.updateData(s);
    }
    static List getHistory(){
        List<String> history= new ArrayList (3);
        history.add("edhi proj 1");
        history.add("edhi proj 2");
        history.add("edhi proj 3");
        return history;
    }
}
