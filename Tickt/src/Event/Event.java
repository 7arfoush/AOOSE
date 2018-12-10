/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;

import Database.DBGK;
import java.time.LocalDateTime;

/**
 *
 * @author holo7
 */
import java.time.Month;

public class Event {

    private String ID;
    private String title;
    private String location;
    private String description;
    private LocalDateTime dateTime;
    private int availableTickets;
    private double ticketPrice;
    DBGK DBaccess = new DBGK();

    public Event() {

    }

    public Event(String name, String location, int eventYear, Month eventMonth, int eventDayOfMonth, int eventHour, int eventMinutes, int numOfAvailableTickets, double ticketPrice) {
        this.title = name;
        this.location = location;
        this.dateTime = LocalDateTime.of(eventYear, eventMonth, eventDayOfMonth, availableTickets, availableTickets);
        this.availableTickets = numOfAvailableTickets;
        this.ticketPrice = ticketPrice;
    }

    public String getEventName() {
        return title;
    }

    public void setEventName(String name) {
        this.title = name;
    }

    public String getEventLocation() {
        return location;
    }

    public void setEventLocation(String location) {
        this.location = location;
    }

    public String getEventDescription() {
        return description;
    }

    public void setEventDescription(String desc) {
        this.description = desc;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int numOfAvailableTickets) {
        this.availableTickets = numOfAvailableTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double priceOfTicket) {
        this.ticketPrice = priceOfTicket;
    }

    public void eventInfo() {
        System.out.println("Event title: " + this.getEventName());
        System.out.println("Event location: " + this.getEventLocation());
        System.out.println("Event description: " + this.getEventDescription());
    }
}
