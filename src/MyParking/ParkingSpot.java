package MyParking;

public class ParkingSpot {
	private int spotId;
    private String spotName;
    private boolean occupied;

    public ParkingSpot(int spotId, String spotName, boolean occupied) {
        this.spotId = spotId;
        this.spotName = spotName;
        this.occupied = occupied;
    }

	public int getSpotId() {
		return spotId;
	}

	public void setSpotId(int spotId) {
		this.spotId = spotId;
	}

	public String getSpotName() {
		return spotName;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

}
