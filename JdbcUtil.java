package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
public static Connection getConnectWithDB()
{
	Connection con=null;
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.
getConnection("jdbc:mysql://localhost:3306/CSJ33DB","root","root");
	
		
	}catch(ClassNotFoundException| SQLException e)
	{
		System.out.println(e);
	}
	return con;
}
}
