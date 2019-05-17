package vterds;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pja9
 */
public class Users {
    // Declaring the functions
    
    String Role;
    String Username;
    String Password;
    
    //Declaring Constructor
    public Users (String New_Role, String New_Username, String New_Password){
        Role = New_Role;
        Username = New_Username;
        Password = New_Password;
        
    }
    
    public boolean login(String X_Username, String X_Password){
        // If the username and the password exist check the role
        return true;
        //call the function to get_role;
        //return false;
        
        
    }
    
}
