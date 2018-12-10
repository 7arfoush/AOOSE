/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Event.Event;

/**
 *
 * @author holo7
 */
public interface User {
    
    int GOER_TYPE = 1;
    int EVENT_MANAGER_TYPE = 2;
    
    public String getName();
    
    public void makeBooking(Event chosenEvent, int orderedTicketsAmount);
}
