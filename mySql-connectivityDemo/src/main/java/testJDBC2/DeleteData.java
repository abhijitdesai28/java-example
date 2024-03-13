package testJDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="root";
        String query="Delete from employee where id=104";

        //load driver or make connector for jdbc
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded successfully");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            int rowAffected = statement.executeUpdate(query);
            if (rowAffected>0){
                System.out.println("Deletion successful,."+rowAffected+" row(s) Deleted");
            }
            else{
                System.out.println("Deletion failed");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
