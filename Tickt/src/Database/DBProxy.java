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
public class DBProxy implements DB {

    DB dbo = new DBServer();

    @Override
    public String retrieveEventTitle(int eID) {
        return dbo.retrieveEventTitle(eID);
    }

    @Override
    public String retrieveEventLocation(int eID) {
        return dbo.retrieveEventLocation(eID);
    }

    @Override
    public String retrieveEventDescription(int eID) {
        return dbo.retrieveEventDescription(eID);
    }
    
    @Override
    public void addNewGoer(Goer goer)
    {
        dbo.addNewGoer(goer);
    }
    @Override
    public void addNewEventManager(EventManager eventManager)
    {
        dbo.addNewEventManager(eventManager);
    }
    
    @Override
    public void addNewBooking(Booking booking)
    {
        dbo.addNewBooking(booking);
    }
    
    @Override
    public void addNewEvent(Event event)
    {
        dbo.addNewEvent(event);
    }

}
