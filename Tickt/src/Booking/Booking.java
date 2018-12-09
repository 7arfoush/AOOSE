/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booking;

import Event.Event;
import User.Goer;
import java.time.LocalDate;

/**
 *
 * @author holo7
 */
public class Booking {
    
    private int ticketsBought;
    
    
    Event e = new Event();
    Ticket t = new Ticket();
    Goer g = new Goer();
    LocalDate dateOfBooking;
    
    public Booking()
    {
        
    };
    
    Booking(Goer booker, Event event, Ticket tickets)
    {
        this.g = booker;
        this.e = event;
        this.t = tickets;
    }

    
    public void eventBooking(Event event, int issuedTicketsAmount, Goer booker)
    {
       g = booker;
       e = event;
       g.addToGoerBookings(this);
       t.sellTickets(issuedTicketsAmount);
       this.ticketsBought = issuedTicketsAmount;
//       System.out.println("Goer who booked: " + booker.getName());
//        System.out.println("Event booked: " + event.getEventName());
//        System.out.println("Amount of tickets: " + issuedTicketsAmount);
    }
    
    public void bookingInfo()
    {
        System.out.println("Goer who booked: " + g.getName());
        System.out.println("Event booked: " + e.getEventName());
        System.out.println("Amount of tickets: " + ticketsBought);
    }
}
