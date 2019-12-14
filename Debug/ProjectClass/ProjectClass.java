/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

import java.util.*;

/**
 *
 * @author Haseeb G
 */
public class ProjectClass {
    public int PID;
    public String name;
    public String Total_Money_Required;
    public ProjectClass()
    {
       PID=12;
       name="Myra";
       Total_Money_Required="250000";
    }
    public ProjectClass(int i,String n,String r)
    {
       PID=1;
       name="Myra";
       Total_Money_Required="250000";
    }
    public void viewCollectedMOney()
    {
        
    }
    public int getPID()
    {
        return 13;
    } 
     
      public String getMoney()
    {
        return "2500000";
    }
    public String getN()
    {
        return "Myra1";
    }  
    public void add()
    {
       database db=new database();
       db.addProject(this);
       
    }
    public boolean delete(int id)
    {
       
       boolean b=database.deleteProject(id);
       return b;
    }
    public boolean update(int id,String m)
    {
       
       boolean b=database.updateProjectMoney(id,m);
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
