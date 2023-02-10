import java.sql.*;

public class addData{

    public static void main (String[] args){

        try{

            String url = "jdbc:mysql://localhost:3306/jdbcfirst";
            String userName = "root";
            String password = "245197";

            //connect to the DB
            Connection conn = DriverManager.getConnection(url, userName, password);

            Statement stmt = conn.createStatement();

            //create db
            //stmt.executeUpdate("CREATE DATABASE jdbcfirst");

            //create table
            //stmt.executeUpdate("CREATE TABLE student(StudentID INT PRIMARY KEY, FirstName VARCHAR(20),LastName VARCHAR(20), ContactNumber INT)");

            //add data
            String sql = "INSERT INTO student (StudentID, FirstName, LastName, ContactNumber) VALUES (1002, 'Anjana','Senarathne', 0771505166)";
            stmt.executeUpdate(sql);

            System.out.println("Cnnected and inserted!");
            //close connection
            conn.close(); 
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
