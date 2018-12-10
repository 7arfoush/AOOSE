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
public interface User {
    
    int GOER_TYPE = 1;
    int EVENT_MANAGER_TYPE = 2;
    DBGK DBaccess = new DBGK();
    
    public String getName();
    
    public void makeBooking(Event chosenEvent, int orderedTicketsAmount);
    
}
