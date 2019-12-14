/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

/**
 *
 * @author maleeha
 */
public class Admin {
    
    
    String first;
    String last;
    String uSer;
    String email;
    String pass;
    
    /**
     *
     */
    public Admin()
    {
        
    }

    /**
     *
     * @param First
     * @param Last
     * @param user
     * @param email
     * @param pass
     */
    public Admin(String First,String Last,String user,String email,String pass)
    {
        this.first=First;
        this.last=Last;
        this.uSer=user;
        this.email=email;
        this.pass=pass;
    }

    /**
     *
     * @return
     */
    public String getFirst() {
        
        
        return first;
    }

    /**
     *
     * @param First
     */
    public void setFirst(String First) {
        this.first = First;
    }

    /**
     *
     * @return
     */
    public String getLast() {
        return last;
    }

    /**
     *
     * @param Last
     */
    public void setLast(String Last) {
        this.last = Last;
    }

    /**
     *
     * @return
     */
    public String getUSer() {
        return uSer;
    }

    /**
     *
     * @param USer
     */
    public void setUSer(String USer) {
        this.uSer = USer;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getPass() {
        return pass;
    }

    /**
     *
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    /**
     *
     * @param u
     * @param pass
     * @return
     */
    public boolean find(String u,String pass)
    {
        
        boolean f;
        f=database.CHECK(u,pass);
        return f;
    }

    /**
     *
     */
    public void iner()
    {
       
        database.Insert(this);
        
    }
}