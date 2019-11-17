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