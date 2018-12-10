/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Booking.Booking;
import Event.Event;
import User.EventManager;
import User.Goer;

/**
 *
 * @author holo7
 */
public interface DB {

    public String retrieveEventTitle(int eID);

    public String retrieveEventLocation(int eID);

    public String retrieveEventDescription(int eID);
    
    public void addNewGoer(Goer goer);
    
    public void addNewEventManager(EventManager eventManager);
    
    public void addNewBooking(Booking booking);
    
    public void addNewEvent(Event event);

}
