package MyParking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_Connection {
	private static final String URL = "jdbc:mysql://localhost:3306/parking_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "723202";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
