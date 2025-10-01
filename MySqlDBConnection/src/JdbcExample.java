import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample {

    public static void main(String[] args) {
        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/unisoft", "root", "root");

            System.out.println("✅ Connection Created ===> Welcome to MySQL");

            // Close the connection
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ SQL Error.");
            e.printStackTrace();
        }
    }
}
