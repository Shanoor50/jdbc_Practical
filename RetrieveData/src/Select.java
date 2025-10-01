import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","shanoor");
			Statement stat = con.createStatement();
			ResultSet rm = stat.executeQuery("select * from student50");
			// Get column info
            ResultSetMetaData meta = rm.getMetaData();
            int n = meta.getColumnCount();

            // Print column names
         // Print column names
            for (int i = 1; i <= n; i++) {
                System.out.printf("%-10s", meta.getColumnName(i)); // %-10s means left-aligned, width 10
            }
            System.out.println();

            // Print rows
            while (rm.next()) {
                for (int i = 1; i <= n; i++) {
                    System.out.printf("%-10s", rm.getString(i));
                }
                System.out.println();
            }

            // Close resources
            rm.close();
            stat.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
