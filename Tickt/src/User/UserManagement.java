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

    DBGK DBaccess = new DBGK();

    public void createAccount(int requestedType, String name) {
        switch (requestedType) {
            case GOER_TYPE:
                int age = 0;
                Goer newGoer = new Goer(Goers.size() + 1, name, age);
                Goers.add(newGoer);
                DBaccess.dbo.addNewGoer(newGoer);
                System.out.println("Goer created.");
                break;
            case EVENT_MANAGER_TYPE:
                EventManager newEM = new EventManager(EventManagers.size() + 1, name);
                EventManagers.add(newEM);
                DBaccess.dbo.addNewEventManager(newEM);
                System.out.println("Event manager created.");
                break;
            default:
                System.out.println("Invalid type requested.");
                break;
        }
    }

}
