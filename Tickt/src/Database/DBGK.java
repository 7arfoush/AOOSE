/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import User.Goer;

/**
 *
 * @author holo7
 */
public class DBGK {

   public DB dbo = new DBProxy();
    
    public static void main(String[] args) {
        // TODO code application logic here
        DB dbo = new DBProxy();
        dbo.retrieveEventTitle(46);       
    }
    
}
