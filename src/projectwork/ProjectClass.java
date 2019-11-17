/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author Haseeb G
 */
public class ProjectClass {
    protected int PID;
    protected String Name;
    protected String Total_Money_Required;
    public ProjectClass()
    {
       PID=0;
       Name=null;
       Total_Money_Required=null;
    }
    public ProjectClass(int i,String n,String r)
    {
       PID=i;
       Name=n;
       Total_Money_Required=r;
    }
    public void viewCollectedMOney()
    {
        
    }
    public int getPID()
    {
        return PID;
    } 
     
      public String getMoney()
    {
        return Total_Money_Required;
    }
    public String getN()
    {
        return Name;
    }  
    public void add()
    {
       database db=new database();
       db.addProject(this);
       
    }
    public boolean delete(int id)
    {
       database d=new database();
       boolean b=d.deleteProject(id);
       return b;
    }
    public boolean update(int id,String m)
    {
       database d=new database();
       boolean b=d.updateProjectMoney(id,m);
       return b;
    }
    public int assignID() 
    {
     database d=new database();
     int i=d.fetchid();
     return i;
    }
   public  ArrayList <ProjectClass> getlist()
   {
       database db=new database();
       ArrayList <ProjectClass> pl =db.Projectlist();
       return pl;
   }
   
    public String fetchname(int aa)
    {
        database d=new database();
       String i=d.getProjectName(aa);
     return i;
    }

}
