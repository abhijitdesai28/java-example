package testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionExample {
    public static void main(String[] args) {
        //database url
        String url="jdbc:mysql://localhost:3306/bike-servicing";

        //database credentials
        String userName="root";
        String password="root";

        //establish the connection
        try(Connection connection= DriverManager.getConnection(url, userName, password)){
            System.out.println("connected to the database");
            //on which connection id its connected
            System.out.println(connection);//com.mysql.cj.jdbc.ConnectionImpl@4116aac9

            //perform database operation from here
        }catch(SQLException e)
        {
            System.err.println("connection field :"+e.getMessage());
        }
    }

}
