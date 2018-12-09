/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import Booking.Booking;
import Booking.BookingsArchive;
import Event.Event;
import User.EventManager;
import User.Goer;
import java.time.Month;

/**
 *
 * @author holo7
 */
public class Core {
    
    public static void main(String[] args) {
        
        System.out.println("Initializing...");
        BookingsArchive Archive = new Booking();
        System.out.println("Archive created.");
        Goer g = new Goer();
        Event e = new Event("ER", "Haram", 2018, Month.MARCH, 22, 15, 30, 300, 30); 
        g.makeBooking(e, 2);
        g.makeBooking(e, 5);
        Archive.retrieveAllFromArchieve();
       
//        g.displayBookings();
//        EventManager Yasser = new EventManager();
//        Yasser.createEvent("WorkShop1", "New Cairo", "Learn how to wak wak.");
//        Yasser.displayManagingEvents();

    }

}
