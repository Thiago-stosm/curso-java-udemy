package sessao14.model.application;

import sessao14.model.entities.Reservation;
import sessao14.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.IO.println;

public class Program {
    void main () {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            println("Room number: ");
            int number = sc.nextInt();
            println("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            println("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkin, checkout);
            println(reservation);

            println();
            println("Enter the date to update the reservation: ");
            println("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            println("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkout);
            println(reservation);
        }
        catch (ParseException e){
            println("Invalid date format");
        }
        catch (DomainException e){
            println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            println("Unexpected e");
        }
        sc.close();
    }
}
