import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
    public static void main(String[] args) {
        try {
            // Load the Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connection Established
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:orcl",
                "system",
                "shanoor"
            );

            // Execute static queries
            Statement stmt = con.createStatement();

            // Insert record
            stmt.executeUpdate("INSERT INTO student50 VALUES (3, 'kareem', 30)");

            System.out.println("One Record Inserted Successfully");

            // Close resources
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
