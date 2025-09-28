package sessao14.model.application;

import sessao14.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.IO.println;

public class Program {
    void main () throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        println("Room number: ");
        int number = sc.nextInt();
        println("Check-in date (dd/MM/yyyy): ");
        Date checkin = sdf.parse(sc.next());
        println("Check-out date (dd/MM/yyyy): ");
        Date checkout = sdf.parse(sc.next());

        if (! checkout.after(checkin)) {
            println("Error in reservation: Check-out date must be after check-in date");
        }
        else {
            Reservation reservation = new Reservation(number, checkin, checkout);
            println(reservation);

            println();
            println("Enter the date to update the reservation: ");
            println("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            println("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());

            String error = reservation.updateDates(checkin, checkout);

            if (error != null){
                println("Error in reservation: " + error);
            }else{
                println(reservation);
            }
        }



        sc.close();
    }
}
