package bank.management.system;

import java.sql.*;

public class Conn {
    
    // jdbc connectivity steps - 
    // 1. register the driver
    // 2. Create connection
    // 3. Create statement
    // 4. execute query
    // 5. close connection
    
    Connection c;
    Statement s;
    public Conn() {
        
        //we do excepetional handling because MySQL is an external entity..... so thats why we use try and catch.
        
        try {
//            Class.forName(com.mysql.cj.jdbc.Driver);  //registering driver ---- 1st step
            
            // connection creation ---- 2nd step
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Ankit123@");
            
            //statement creation ----- 3rd step
            
            s = c.createStatement();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
