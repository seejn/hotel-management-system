package hotel_management.main;
import java.sql.*;

public class DBConnection {
		
		static Connection connection;
		public static Connection getConn() throws SQLException
		{
			if(connection == null)
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system","root","");
			return connection;
		}
}
