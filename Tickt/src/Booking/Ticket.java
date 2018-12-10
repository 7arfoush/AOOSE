/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booking;

/**
 *
 * @author holo7
 */
public class Ticket {

    private int numOfAvailableTickets;
    private int numOfAllTickets;
    private double priceOfTicket;

    Ticket() {

    }

    public Ticket(int ticketPrice, int ticketsAmount) {
        this.priceOfTicket = ticketPrice;
        this.numOfAllTickets = ticketsAmount;
    }

    public int getNumOfAvailableTickets() {
        return numOfAvailableTickets;
    }

    public int getNumOfAllTickets() {
        return numOfAllTickets;
    }

    public double getPriceOfTicket() {
        return priceOfTicket;
    }
    
    public void setNumOfAllTickets(int allTicketsAmount)
    {
        this.numOfAllTickets = allTicketsAmount;
    }
    
    public void setPriceOfTicket(double ticketPrice)
    {
        this.priceOfTicket = ticketPrice;
    }
    
    public int remainingTickets() {
        return numOfAllTickets - numOfAvailableTickets;
    }

    public void sellTickets(int ticketsSoldAmount) {
        numOfAvailableTickets = numOfAvailableTickets - ticketsSoldAmount;
    }
}
