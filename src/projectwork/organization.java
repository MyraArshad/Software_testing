/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maleeha
 */
public class organization {
     private static organization single_instance = null;
    String oid;
    String name;
    String address;
    String founder;
    String date;
    String phone;
    
    
     public organization()
     {
         
     }
    private organization(String oo,String nn,String aa,String ff,String dd,String pp)
    {  
        this.oid=oo;
        this.name=nn;
        this.address=aa;
        this. founder=ff;
        this.date=dd;
        this.phone=pp;
        
    }
    public static organization getInstance(String o,String n,String a,String f,String d,String p) 
    { 
        if (single_instance == null) 
            single_instance = new organization(o,n,a,f,d,p); 
  
        return single_instance; 
    } 
    public void add()
    {
        database d=new database();
        d.Insert1(this);
    }
    public ResultSet Selecting()
    {
        database d=new database();
        ResultSet rs = null;
        try{
            rs=d.Select();
        }catch(SQLException e)
        {
            e.getStackTrace();
        }
        return rs;
    }
    public boolean adress(String id,String update)
    {
        database d=new database();
        boolean flag;
        flag=d.update_adress(id,update);
        return flag;
    }

    public boolean phone(String id,String update)
    {
        database d=new database();
        boolean flag;
        flag=d.update_phone(id,update);
        return flag;
    }
   
}

