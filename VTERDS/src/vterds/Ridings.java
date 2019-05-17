/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vterds;

/**
 *
 * @author Joanne
 */
public class Ridings {
    static String Name;
    static  int ID;
    static int NumVoters;
    static int numIncumbents;
    //static char DateCreated;
    java.util.Date DateCreated = new java.util.Date();
    static int numCandidates;
    
    public int getRidingID(){
        return ID;
    }
    
    public int getNumVoters(){
        return NumVoters;
    }
    public int getnumIncumbents (){
        return numIncumbents;
    }
    
    public java.util.Date getDateCreated (){
        return DateCreated;
    }
    public int getnumCandidates (){
        return numCandidates;
    }
    
    
}
