import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcMySqlMain1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","4466");
		System.out.println("Connection established!!\n");
		Statement stmt= dbcon.createStatement();
		
		
	}

}
