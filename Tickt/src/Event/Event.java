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

    private int ID;
    private String title;
    private String location;
    private String description;
    private LocalDateTime dateTime;

    public Event() {

    }

    public Event(int ID, String name, String location, String description) {
        this.ID = ID;
        this.title = name;
        this.location = location;
        this.description = description;
    }

    public int getID() {
        return ID;
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

    public void eventInfo() {
        System.out.println("Event ID: " + this.getID());
        System.out.println("Event title: " + this.getEventName());
        System.out.println("Event location: " + this.getEventLocation());
        System.out.println("Event description: " + this.getEventDescription());
    }
}
