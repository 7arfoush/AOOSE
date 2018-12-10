/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Database.DBGK;
import static User.User.EVENT_MANAGER_TYPE;
import static User.User.GOER_TYPE;
import java.util.ArrayList;

/**
 *
 * @author holo7
 */
public class UserManagement {

    public ArrayList<User> Goers = new ArrayList<>();
    public ArrayList<User> EventManagers = new ArrayList<>();

    public Goer basicGoer;
    public EventManager basicEventManager;

    DBGK DBaccess = new DBGK();

    public User createAccount(int requestedType, String name) {
        switch (requestedType) {
            case GOER_TYPE:
                int age = 0;
                basicGoer = new Goer(Goers.size() + 1, name, age);
//                Goer newGoer = new Goer(Goers.size() + 1, name, age);
//                Goers.add(newGoer);
//                DBaccess.dbo.addNewGoer(newGoer);
                Goers.add(basicGoer);
                DBaccess.dbo.addNewGoer(basicGoer);
                System.out.println(basicGoer.name);
                System.out.println("Goer created.");
                return basicGoer;
                
            case EVENT_MANAGER_TYPE:
                basicEventManager = new EventManager(EventManagers.size() + 1, name);
                EventManagers.add(basicEventManager);
                DBaccess.dbo.addNewEventManager(basicEventManager);
                System.out.println("Event manager created.");
                return basicEventManager;
        
            default:
                System.out.println("Invalid type requested.");
                break;
        }
        return null;
    }
}
