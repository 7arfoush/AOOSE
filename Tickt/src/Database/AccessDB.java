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
public class AccessDB {

    public static void main(String[] args) {
        // TODO code application logic here
        DB dbo = new DBProxy();
        dbo.retrieveEventTitle(46);
      
    }
    
}
