/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode;

import IT19035536.Add_Subject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author aweer
 */
public class DBconnects {
    //public static Connection con;
    //public static Statement st;
    
    public static Connection connects(){
        Connection conn = null;
      try{
          Class.forName("org.sqlite.JDBC"); 
         String url="jdbc:sqlite:DBconnect.db";
         conn=DriverManager.getConnection(url);
         //st=con.createStatement();
         System.out.println("successful");
      }catch(Exception ex){
          System.out.println("connection failed");
      }
      //return st;
      return conn;
      
    }
    
   
   
}
