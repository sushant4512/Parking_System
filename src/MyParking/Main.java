package MyParking;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SpotManager spotManager = new SpotManager();
        List<ParkingSpot> parkingSpots = spotManager.getAllParkingSpots();

        for (ParkingSpot spot : parkingSpots) {
            System.out.println("Spot ID: " + spot.getSpotId() + ", Name: " + spot.getSpotName() + ", Occupied: " + spot.isOccupied());
        }

        TransactionManager transactionManager = new TransactionManager();
        transactionManager.startParkingTransaction(1);
        // Simulate parking for some time
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transactionManager.endParkingTransaction(1, 10.0); // Amount charged for parking
    }

	}


