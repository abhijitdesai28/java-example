package testJDBC;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
       //database credential
        String url="jdbc:mysql://localhost:3306/school";
        String userName="root";
        String password="root";
        String query="Select * from address";
        try{
            //all drivers imported
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("drivers loaded successfully");
        }catch (ClassNotFoundException e)
        {
            System.out.println("unable to load driver :"+ e.getMessage());
        }

        //connect to database
        try{
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("connection established successfully");
            //create statement to execute sql query
            Statement statement=connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                int addressId=resultSet.getInt("address_Id");
                String city=resultSet.getString("city");

                System.out.println();
                System.out.println("===================================");
                System.out.println("addressId:"+addressId+"\n city:"+city);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
