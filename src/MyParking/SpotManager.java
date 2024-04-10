package MyParking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SpotManager {
	
	private Connection connection;

    public SpotManager() {
        try {
            connection = Database_Connection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ParkingSpot> getAllParkingSpots() {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM parking_spots");

            while (resultSet.next()) {
                int spotId = resultSet.getInt("spot_id");
                String spotName = resultSet.getString("spot_name");
                boolean occupied = resultSet.getBoolean("occupied");
                parkingSpots.add(new ParkingSpot(spotId, spotName, occupied));
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return parkingSpots;
    }

}
