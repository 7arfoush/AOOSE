/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Database.DBGK;
import User.*;
import static org.junit.Assert.*;  
import org.junit.*;  
/**
 *
 * @author holo7
 */
public class TestCases {
    
    UserManagement UM = new UserManagement();
    DBGK dbA = new DBGK();
    Goer aGoer = new Goer();
    User aUser = new Goer();
    
    @Test
    public void testAccountCreation()
    {
        assertNotNull(UM.createAccount(1, "wae"));
    }  
    
    @Test
    public void testInsertingToDB()
    {
        assertTrue(dbA.dbo.addNewGoer(aGoer));
    }
    
    @Test
    public void testGoerAndUserOfGoerSame()
    {
        assertSame(aUser.getClass(), aGoer.getClass());
    }
    
}
