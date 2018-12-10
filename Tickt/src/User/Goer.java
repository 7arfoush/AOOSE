/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Booking.Booking;
import Database.DBGK;
import Event.Event;
import java.util.ArrayList;

/**
 *
 * @author holo7
 */
public class Goer implements User {

    ArrayList<Booking> goerBookings = new ArrayList();

    int ID;
    String name;
    int age;
    
    
    
    public Goer(int userID, String userName, int userAge) {
        this.ID = userID;
        this.name = userName;
        this.age = userAge;
    }

    public Goer() {

    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public void addToGoerBookings(Booking b) {
        goerBookings.add(b);
    }

    @Override
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
