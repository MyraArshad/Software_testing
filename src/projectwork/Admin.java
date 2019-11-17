/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;
import java.util.*;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Admin {
    
    
    String First;
    String Last;
    String USer;
    String email;
    String pass;
    
    
        
    public Admin()
    {
        
    }
    public Admin(String First,String Last,String user,String email,String pass)
    {
        this.First=First;
        this.Last=Last;
        this.USer=user;
        this.email=email;
        this.pass=pass;
    }

    public String getFirst() {
        
        
        return "HUSNAIN";
    }

    public void setFirst(String First) {
        this.First = First;
    }

    public String getLast() {
        return "RAFIQ";
    }

    public void setLast(String Last) {
        this.Last = Last;
    }

    public String getUSer() {
        return "HUSNAIN";
    }

    public void setUSer(String USer) {
        this.USer = USer;
    }

    public String getEmail() {
        return "HUSNAIN@GMAIL.COM";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return "ASAD";
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    

    public boolean find(String u,String pass)
    {
        database d=new database();
        boolean f;
        f=d.CHECK(u,pass);
        return f;
    }
    public void iner()
    {
        database d=new database();
        d.Insert(this);
        
    }
}