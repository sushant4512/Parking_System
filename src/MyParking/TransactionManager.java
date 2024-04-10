package MyParking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class TransactionManager {
	 private Connection connection;

	    public TransactionManager() {
	        try {
	            connection = Database_Connection.getConnection();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void startParkingTransaction(int spotId) {
	        try {
	            LocalDateTime startTime = LocalDateTime.now();
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO parking_transactions (spot_id, start_time) VALUES (?, ?)");
	            statement.setInt(1, spotId);
	            statement.setObject(2, startTime);
	            statement.executeUpdate();
	            statement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void endParkingTransaction(int spotId, double amount) {
	        try {
	            LocalDateTime endTime = LocalDateTime.now();
	            PreparedStatement statement = connection.prepareStatement("UPDATE parking_transactions SET end_time = ?, amount = ? WHERE spot_id = ? AND end_time IS NULL");
	            statement.setObject(1, endTime);
	            statement.setDouble(2, amount);
	            statement.setInt(3, spotId);
	            statement.executeUpdate();
	            statement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

}
