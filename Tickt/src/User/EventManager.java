/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Event.Event;
import java.util.ArrayList;
/**
 *
 * @author holo7
 */
public class EventManager {
    
    ArrayList<Event> managingEvents = new ArrayList();
    
    public void createEvent()
    {
        String eName = " ";
        String eLoc = " ";
        String eDesc = " ";
        Event e = new Event();
        e.setEventName(eName);
        e.setEventLocation(eLoc);
        e.setEventDescription(eDesc);
        managingEvents.add(e);
    }
    
    public void displayManagingEvents()
    {
        System.out.println(managingEvents.toString());
    }
}
