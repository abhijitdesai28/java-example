package testJDBC2;

import java.sql.*;

public class RetriveAllData {
    public static void main(String[] args)throws ClassNotFoundException {

        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="root";
        String query1="select * from employee;";

        //load driver or make connector for jdbc
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded successfully");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        //connect to database
        try{
            Connection connection= DriverManager.getConnection(url, username,password);
            System.out.println("connection established successfully");
            //create statement to run query
            Statement statement=connection.createStatement();
            ResultSet result1 = statement.executeQuery(query1);
            //here we're performing query to fetch all employee details
            while (result1.next()){
                int id=result1.getInt("id");
                String name=result1.getString("name");
                String job_title=result1.getString("job_title");
                double salary=result1.getDouble("salary");
                System.out.println("-------------------------------");
                System.out.println("id :"+id);
                System.out.println("name :"+name);
                System.out.println("job_title :"+job_title);
                System.out.println("salary :"+salary);
            }
            result1.close();
            statement.close();
            connection.close();
            System.out.println("connection closed successfully");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
