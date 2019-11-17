/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CIT
 */
public class dbConnectivity {
   
    
    dbConnectivity() //cons
    {
    }
    void addData(donation d1)
    {
         
       Statement stmt1=null;
       try {
            Connection con = connect.getConnection();
            System.out.println("Inserting records into the table...");
            PreparedStatement st = con.prepareStatement("INSERT INTO DONATE(ID,TYPE,DONOR,AMOUNT,DONATED_TO,DATE)VALUES("+d1.id+",'"+d1.type+"','"+d1.donor+"',"+d1.amount+","+d1.donated_to+",'"+d1.date+"')");
                    
            int aa = st.executeUpdate();
            if (aa > 0) {
                System.out.println("Inserted records into the table...");
            } else {
                System.out.println("records cannot be Inserted into the table...");
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
    int getID() 
    {
        
         int a = 0;
         
         try
        {
           Connection con=connect.getConnection();
           String s1="select max(id)from donate";
           Statement stml=con.createStatement();
           ResultSet rs=stml.executeQuery(s1);
           while(rs.next())
             {
         a= rs.getInt(1);
             }
        }
           catch(SQLException e)
        {
            System.out.println(e);
        }
         return a;
    }
    String check(String s){
        String a = null;
        try
     {
          Connection con=connect.getConnection();
           PreparedStatement stml=con.prepareStatement(s);
            ResultSet rs=stml.executeQuery();
            while(rs.next())
                {
                     a= rs.getString(1);
                }
     }  
     catch(Exception e)
     {
            System.out.println(e);         
     }
        return a;
    }
    void updateData(String s)
    {
     try
     {
         Connection con=connect.getConnection();
         PreparedStatement stml=con.prepareStatement(s);
         
         stml.executeUpdate();
     }  
     catch(Exception e)
     {
            System.out.println(e);         
     }
    }
     void deleteData(String s)
    {
     try
     {
          Connection con=connect.getConnection();
         PreparedStatement stml=con.prepareStatement(s);
          stml.executeUpdate();
     }  
     catch(Exception e)
     {
            System.out.println(e);         
     }
    }
     List displayData(){
         
        List<donation> history = new ArrayList();
         try{
             Connection con=connect.getConnection();
         String s="select * from donate";
         PreparedStatement stml=con.prepareStatement(s);
         ResultSet rs=stml.executeQuery();
        
        while (rs.next())
        {  
            donation d= new donation(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(6));
            history.add(d);
        }
         }
         catch(SQLException e){
             
         }
        return history;
     }
}
