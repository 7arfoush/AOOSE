/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Booking.Booking;
import Event.Event;
import java.util.ArrayList;

/**
 *
 * @author holo7
 */
public class Goer extends User {

    ArrayList<Booking> goerBookings = new ArrayList();

    public void addToGoerBookings(Booking b) {
        goerBookings.add(b);
    }

    public void makeBooking(Event chosenEvent, int amountOfTickets) {
        Booking newBooking = new Booking();
        newBooking.eventBooking(chosenEvent, amountOfTickets, this);
        addToGoerBookings(newBooking);
    }

    public void displayBookings() {
        for (int i = 0; i < goerBookings.size(); i++) {
            goerBookings.get(i).bookingInfo();
            System.out.println("-----------");
        }
    }

}
