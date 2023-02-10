import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class retrieveData {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbcfirst";
            String userName = "root";
            String password = "245197";

            Connection conn = DriverManager.getConnection(url, userName, password);

            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int studentID = rs.getInt("StudentID");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                int ContactNumber = rs.getInt("ContactNumber");

                System.out.println("StudentID: " + studentID + " \nFirstName: " + FirstName + " \nLastName: " + LastName + " \nContactNumber: " + ContactNumber + "\n");
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection Error");
        }
    }
}
