/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {
   static String hostName ="haho.sit.kmutt.ac.th";
   static String user = "haho";
   static String password = "hahoapp";
   static String db_Name = "hahoapplication";
    
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded and registered");
            
            String url ="jdbc:mysql://"+hostName+"/"+db_Name;
            
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("MySQL Connection created\n");
            
        }
        catch(ClassNotFoundException cfe){
            System.out.println(cfe);
        }
        catch(SQLException se){
            System.out.println(se);
        }
        
        
    }  
}