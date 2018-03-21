/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */

import java.util.ArrayList;

public class Flight {
    private ArrayList<String> flight;
    
    public Flight(){
        this.flight = new ArrayList<String>();
    }
    
    public void add(String plane_id, String flight){
        this.flight.add(plane_id + " (" + flight + ")");
        
    }
    
    public void printFlights(){
        for(String id : this.flight){
            System.out.println(id);
        }
    }
}
