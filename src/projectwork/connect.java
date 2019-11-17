/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

import java.sql.Connection;
import java.sql.DriverManager;

public class connect {
    public static Connection getConnection(){
		Connection con=null;
		try{
                    String myUrl = "jdbc:derby://localhost:1527/Admin";
                    con = DriverManager.getConnection(myUrl,"myra", "123");
                    System.out.println("Connected database successfully...");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
}
