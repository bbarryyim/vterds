 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vterds;

/**
 *
 * @author Jamie Sin
 */
public class Ballot {
    int ballotNumber;
    String location;
    String ridingName;
    Boolean spoiled; // keep track of spoiled ballots with a boolean flag
    
    public String getLocation () {
        return location;
    }
    
    public String addToRiding(String riding) {
        ridingName = riding;
        return ridingName;
    }
    
    public int getBallotNumber() {
        return ballotNumber;
    }
    
}
