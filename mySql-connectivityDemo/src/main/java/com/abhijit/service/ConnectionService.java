package com.abhijit.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionService
{
    public Connection getConnection()
    {
        Connection connection=null;
        try
        {
           // String url="jdbc:mysql://localhost:3306/school";
            String url = "jdbc:mysql://localhost:3306/school";
            String username="root";
            String password ="*************";
            connection= DriverManager.getConnection(url, username , password);
            System.out.println("connected to database");
        }
        catch (SQLException e)
        {
            System.out.println("Connection Error: "+e.getMessage());
        }
        return connection;
    }
}
