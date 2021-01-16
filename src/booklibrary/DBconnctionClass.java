/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booklibrary;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author safi
 */
public class DBconnctionClass {
    
     public static Connection connection ;
    
    public static Connection getinstance()
    {
        if(connection==null)
        {
    try{
        connection=DriverManager.getConnection("jdbc:ucanaccess://d:/LibertyBookDatabase.accdb");
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
    }
    return connection;
    }
    
}
