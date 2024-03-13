package testJDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="root";
        String query="UPDATE employee SET job_title='automation-tester' where id=103";

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
                System.out.println("Update successful,."+rowAffected+" row(s) Updated");
            }
            else{
                System.out.println("Update failed");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
