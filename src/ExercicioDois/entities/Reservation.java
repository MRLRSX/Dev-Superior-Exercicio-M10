package ExercicioDois.entities;

import java.time.Duration;
import java.time.LocalDate;

import ExercicioDois.entities.exception.CheckInException;
import ExercicioDois.entities.exception.CheckOutException;



public class Reservation {

	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;

	public Reservation() {}
	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {

		this.roomNumber = roomNumber;
		this.updateDates(checkin, checkout);
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}
  
	public Long duration() {
		return Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay()).toDaysPart();
		
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkout) throws CheckInException, CheckOutException {
	
		if(LocalDate.now().isAfter(checkin)){
		   throw new CheckInException("Reservation dates for update must be future dates");
		} 
		if(checkout.isAfter(checkout)) {			
			throw new CheckOutException("Check-Out date must be after check-in dates");
		} 
		this.checkin = checkin;
		this.checkout = checkout;
	}
	@Override
	public String toString() {
		
		return "Reservation roomNumber = " + roomNumber + ", checkin = " + checkin + ", checkout = " + checkout + " Total Days = " + duration();
	}
	
}
