package MyParking;

import java.time.LocalDateTime;

public class ParkingTransaction {
	private int transactionId;
    private int spotId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double amount;

    public ParkingTransaction(int spotId, LocalDateTime startTime) {
        this.spotId = spotId;
        this.startTime = startTime;
    }

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getSpotId() {
		return spotId;
	}

	public void setSpotId(int spotId) {
		this.spotId = spotId;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
    

}
