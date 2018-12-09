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
    
    String name;
    String age;
    
    User(){
        
    };
    
    User(String userName, String userAge)
    {
        this.name = userName;
        this.age = userAge;
    }
}
