/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booking;

import Event.Event;
import User.Goer;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author holo7
 */
public class Booking implements BookingsArchive{

    static ArrayList<Booking> ARCHIVE = new ArrayList<>();
    private int ticketsBought;
    Event e = new Event();
    Ticket t = new Ticket();
    Goer g = new Goer();
    LocalDate dateOfBooking;

    public Booking() {

    }

    Booking(Goer booker, Event event, Ticket tickets) {
        this.g = booker;
        this.e = event;
        this.t = tickets;
    }

    public void addToArchive() {
        ARCHIVE.add(this);
    }

    public void eventBooking(Event event, int issuedTicketsAmount, Goer booker) {
        this.g = booker;
        this.e = event;
        this.g.addToGoerBookings(this);
        this.t.sellTickets(issuedTicketsAmount);
        this.ticketsBought = issuedTicketsAmount;
        this.addToArchive();
        System.out.println("Booking done successfully. Goer: " + booker.getName() + ". Event: " + e.getEventName() + ". Tickets bought: " + ticketsBought);
    }

    public void bookingInfo() {
        System.out.println("Goer who booked: " + g.getName());
        System.out.println("Event booked: " + e.getEventName());
        System.out.println("Amount of tickets: " + ticketsBought);
    }

    @Override
    public void retrieveAllFromArchieve() {
        System.out.println("------ARCHIVE------");
        System.out.println("Bookings in archive: " + ARCHIVE.size());

        for (int i = 0; i < ARCHIVE.size(); i++) {

            ARCHIVE.get(i).bookingInfo();
            System.out.println("-----------");
        }
    }
}
