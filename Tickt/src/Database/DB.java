/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author holo7
 */
public interface DB {

    public String retrieveEventTitle(int eID);

    public String retrieveEventLocation(int eID);

    public String retrieveEventDescription(int eID);

}
