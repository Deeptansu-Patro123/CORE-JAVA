import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class JdbcMySqlMain {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","4466");
		System.out.println("Connection established!!\n");
		Statement stmt= dbcon.createStatement();
		//stmt.executeUpdate("INSERT INTO NEWTABLE VALUES (11,'Ronaldo',90909)");
		//stmt.executeUpdate("DELETE FROM NEWTABLE WHERE ID=12");
		//stmt.executeUpdate("UPDATE NEWTABLE SET Deeptansu='PATRO',Phone='0000' WHERE ID=1");
		ResultSet rs=stmt.executeQuery("SELECT * FROM NEWTABLE");
		
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("Deeptansu");
			double phone=rs.getDouble("Phone");
			System.out.println(id+"--"+ name + "--"+ phone);
		}
		System.out.println("----------------------------");
		
		stmt.executeUpdate("INSERT INTO NEWESTTABLE SELECT * FROM NEWTABLE");
		ResultSet rs1=stmt.executeQuery("SELECT * FROM NEWESTTABLE");
		while(rs1.next())
		{
			int id=rs1.getInt("id");
			String name=rs1.getString("Deeptansu");
			double phone=rs1.getDouble("Phone");
			System.out.println(id+ " - "+name+" - "+phone);
		}
		
		rs.close();
		rs1.close();
		stmt.close();
		dbcon.close();
		

	}

}
