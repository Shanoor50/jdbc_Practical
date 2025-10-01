import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static void main(String[] args){
		try {
			//Load the Driver
			Class c=Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection Established
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","shanoor");
			System.out.println("Connection Established Successfully");
		}catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found.");
            e.printStackTrace();
        }catch (SQLException e) {
            System.out.println("❌ SQL Error.");
            e.printStackTrace();
        }
	}
}
