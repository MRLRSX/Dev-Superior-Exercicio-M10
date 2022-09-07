package ExercicioDois;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import ExercicioDois.entities.Reservation;
import ExercicioDois.entities.exception.CheckInException;
import ExercicioDois.entities.exception.CheckOutException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Room Number: ");
		Integer number = entrada.nextInt();
		
		try {
			System.out.print("Check-IN date (dd/MM/yyyy)");
			LocalDate checkIn = LocalDate.parse(entrada.next().trim(), dataFormatter);
			System.out.print("Check-Out date(dd/MM/yyyy)");
			LocalDate checkOut = LocalDate.parse(entrada.next().trim(), dataFormatter);

			Reservation reserva = new Reservation(number, checkIn, checkOut);
			System.out.println(reserva);
		} catch (DateTimeParseException errorDateTime) {
			System.out.printf("Error Invalid value for MonthOfYear %s", errorDateTime.getMessage());
		} catch (CheckInException errorCheckIn) {
			System.out.printf("%s", errorCheckIn.getMessage());
		} catch (CheckOutException errorCheckOut) {
			System.out.printf("%s", errorCheckOut.getMessage());
		} finally {
			entrada.close();
		}

	}

}
