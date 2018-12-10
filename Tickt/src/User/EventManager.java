/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Event.Event;
import java.util.ArrayList;
import Database.DBGK;
/**
 *
 * @author holo7
 */
public class EventManager implements User{

    ArrayList<Event> managingEvents = new ArrayList();
    
    int ID;
    String name;
    
    public EventManager()
    {
        
    }
    
    EventManager(int userID, String userName)
    {
        this.ID = userID;
        this.name = userName;
    }
    
    @Override
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return ID;
    }
    

    public void createEvent(String eventName, String eventLocation, String eventDescription) {
        Event newEvent = new Event();
        newEvent.setEventName(eventName);
        newEvent.setEventLocation(eventLocation);
        newEvent.setEventDescription(eventDescription);
        managingEvents.add(newEvent);
    }
    
    public void displayManagingEvents() {
        for (int i = 0; i < managingEvents.size(); i++) {
            managingEvents.get(i).eventInfo();
            System.out.println("-----------");
        }
    }
    
    @Override
    public void makeBooking(Event chosenEvent, int orderTicketsAmount)
    {
        System.out.println("This type of users cannot place bookings.");
    }
}
