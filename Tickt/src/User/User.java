/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author holo7
 */
public class User {
    
    int ID;
    String name;
    String age;
    
    User(){
        
    };
    
    User(int userID, String userName, String userAge)
    {
        this.ID = userID;
        this.name = userName;
        this.age = userAge;
    }
    
    public String getName()
    {
        return name;
    }
}
