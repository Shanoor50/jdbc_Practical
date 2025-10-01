import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","shanoor");
			Statement stmt = con.createStatement(); //execute static queries
			stmt.execute("create table student50 (rollno number(2),name varchar2(10),marks number(3))");
			System.out.println("Table Created Successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
