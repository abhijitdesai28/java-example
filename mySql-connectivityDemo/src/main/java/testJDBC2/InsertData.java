package testJDBC2;

import java.sql.*;

public class InsertData {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="root";
        String query2="insert into employee(id ,name ,job_title, salary) values(104 , 'sham','manager', 80000.0);";

        //load driver or make connector for jdbc
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded successfully");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            int rowAffected = statement.executeUpdate(query2);
            if (rowAffected>0){
                System.out.println("insertion successful,."+rowAffected+" row(s) inserted");
            }
            else{
                System.out.println("insertion failed");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        }
    }

