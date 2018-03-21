/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
import java.util.HashMap;

public class Airplane {
    private HashMap<String, Integer> airplane;
    
    public Airplane(){
        this.airplane = new HashMap<String, Integer>();
    }
    
    public void add(String id, int capacity){
        this.airplane.put(id, capacity);
    }
    
    public void printPlanes(){
        for(String id : this.airplane.keySet()){
            System.out.println(id + " (" + this.airplane.get(id) + " ppl)");
        }
    }
    
    public String printPlane(String id){
        return id + " (" + this.airplane.get(id) + " ppl)";
    }
}
