package com.abhijit;

import com.abhijit.service.ConnectionService;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final ConnectionService connectionService=new ConnectionService();
    public static void main( String[] args )
    {
        //get a database connection
        Connection connection=connectionService.getConnection();

        //use the connection to execute sql queries and interact with database

        try
        {
            //our database operation here
            Statement statement=connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM address");
            System.out.println("Printing data from table :"+resultSet.getMetaData().getTableName(1));

            System.out.println("---------------------------------------------------");

            //now iterate data
            while(resultSet.next())
            {
                int id = resultSet.getInt("address_id");//Replace "id" with your actual column name
                String city = resultSet.getString("city");//Replace "city" with your accual column name

                //do something with the data, e.g,print it
                System.out.println("address id:"+id+"  | city :"+city);

            }

            System.out.println("-------------------------------");
        } catch (SQLException e) {
                  System.err.println("sql error :"+e.getMessage());
        }
        finally {
            //here we close connection when done
            if(connection !=null)
            {
                try{
                    connection.close();
                }
                catch (SQLException e)
                {
                    System.err.println("ERROR closing connection :"+e.getMessage());
                }
            }
        }
    }
}
