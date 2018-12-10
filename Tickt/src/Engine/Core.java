/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import Booking.Booking;
import Booking.BookingsArchive;
import Event.Event;
import User.UserManagement;

/**
 *
 * @author holo7
 */
public class Core implements Tickter{
    
    @Override
    public void update()
    {
        
    }
    
    public static void main(String[] args) {
        
        UserManagement UM = new UserManagement();
        System.out.println("Initializing...");
        BookingsArchive Archive = new Booking();
        System.out.println("Archive created.");
        UM.createAccount(1, "Yosr");
        UM.createAccount(2, "Yosra");
        Event e = new Event(1, "ER", "Haram", "2018NEW"); 
        Event ew = new Event(2, "ER", "Haram", "Wow"); 
        UM.Goers.get(0).makeBooking(e, 2);
        UM.Goers.get(0).makeBooking(ew, 5);
        System.out.println(UM.Goers.get(0).getName());
        Archive.retrieveAllFromArchieve();
        
       
//        g.displayBookings();
//        EventManager Yasser = new EventManager();
//        Yasser.createEvent("WorkShop1", "New Cairo", "Learn how to wak wak.");
//        Yasser.displayManagingEvents();

    }

}
