 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vterds;
/**
 *
 * @author Peterson
 */

//Dont know for sure which one I need yet
//import java.util.*;


public class SearchSummary {
    
    private String Riding_Name;
    private String Party_Name;
    private String IncumbentParty_Name;
    int numVoters;
    int numSeats;
    int numCandidates;
    int numIncumbents;
    char dateCreated;
    
    public String reportType;
    
    public SearchSummary(){
        Riding_Name = null;
        Party_Name = null;
        IncumbentParty_Name = null;
        numVoters = 0;
        numSeats = 0;
        numCandidates = 0;
        //dateCreated = ;
    }

    public boolean setInputKey(){
        String query = "SELECT * from <table name> WHERE ";
        int inputDex = 0;
        
        
        Riding_Name = "Vancouver";
        //if riding_name has input then merge query string
        //query = query + "RidingName LIKE '" + Riding_Name + "' ";
        
        //Party_Name = "Green";
        //
        //query = query + "PartyName=" +(Party_Name)+ " ";
        
        //IncumbentParty_Name = "NDP";
        //query = query + "IncumbentPartyName=" +(IncumbentParty_Name)+ " ";
        
        //numVoters = 260;
        //query = query + "NumberOfVoters=" +(numVoters)+ " ";
        
        //numSeats = 15;
        //query = query + "NumberOfSeats=" +(numSeats)+ " ";
        
        //numCandidates = 30;
        //query = query + "NumberOfCandidates=" +(numCandidates)+ " ";
        
        //numIncumbents = 5;
        //query = query + "NumberOfIncumbents=" +(numIncumbents)+ " ";
        
        
        
        //System.out.println("Test is "+(query));
//        Date dateCreated = "03/14/2011";
//        String str = String.format("%tm/%<td/%<tY", d);
       
/*        try{
        inStream.close();
        }catch(IOException ioe){}
    */
        return true;
    } 
    
    public int setReportType(){
//grabs the user selection and assigns reportType to either Summary,
//Elected, or Predicted. returns 1 if set is successful
        
        
        return 1;
    }
    
    public void genSearchResults(){
/*NEED a class to create DB connection     
        try {
        <DBconnectionClass>.init(args[0]);
        Connection conn = <DBconnectionClass>.getConnection();
        Statement stat = conn.createStatement();
        ResultSet result = stat.executeQuery(query + " LIMIT 5");
        stat.execute("DROP TABLE <table name>");
        }
        finally {
            conn.close();
        }
        * 
        */

       
        
}
    public void genReport(){
        //IS THIS THE SAME AS GENSEARCHRESULTS????
        //Need to pull selected data to show on report from database.
        //set up a report that is save-able to harddrive
        Riding_Name = "ABD";
        Ridings Riding_Name = new Ridings();
       //dateCreated = Riding_Name.getDateCreated();
    }
}
    
    
    
    
    
    
