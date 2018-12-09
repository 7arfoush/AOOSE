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
public class DBProxy implements DB {

    DBServer dbo = new DBServer();

    @Override
    public String retrieveEventTitle(int eID) {
        return dbo.retrieveEventTitle(eID);
    }

    @Override
    public String retrieveEventLocation(int eID) {
        return dbo.retrieveEventLocation(eID);
    }

    @Override
    public String retrieveEventDescription(int eID) {
        return dbo.retrieveEventDescription(eID);
    }

}
