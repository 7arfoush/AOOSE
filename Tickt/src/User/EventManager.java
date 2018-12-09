/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Event.Event;
import java.util.ArrayList;
import Database.DBGatekeeper;
/**
 *
 * @author holo7
 */
public class EventManager {

    ArrayList<Event> managingEvents = new ArrayList();

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
}
