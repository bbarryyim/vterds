/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vterds;

/**
 *
 * @author Joanne
 */

import java.util.Date;

public class Election {
    java.util.Date date = new java.util.Date();
    String status;
    String LastLogin;
    
    public Election() {
    status = "Before Election";
    }
    
    public java.util.Date getDate(){
        return date;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void advanceStatus() {
        
    }
    
    public String getLastLogin(){
        /* the rest of the function is missing here, just placeholder that will return result at the end*/
        return LastLogin;
    }
}
