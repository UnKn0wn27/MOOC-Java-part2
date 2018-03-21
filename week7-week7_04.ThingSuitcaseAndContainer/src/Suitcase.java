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

public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addThing(Thing thing){
        int totalWeight = totalWeight();
        
        totalWeight += thing.getWeight();
        if (totalWeight <= this.maxWeight)
            this.things.add(thing);
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Thing t : this.things){
            totalWeight += t.getWeight();
        }
        
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        if (!this.things.isEmpty()){
            Thing heaviest = this.things.get(0);
            
            for(Thing thing : this.things){
                if(heaviest.getWeight() < thing.getWeight())
                    heaviest = thing;
            }

            return heaviest;
        }
        return null;
    }
    
    public void printThings(){
        for(Thing thing : this.things){
            System.out.println(thing);
        }
    }
    
    @Override
    public String toString(){
        if(this.things.size() == 0)
            return "empty (" + this.totalWeight() + " kg)";
        else if(this.things.size() == 1)
            return this.things.size() + " thing (" + this.totalWeight() + " kg)";
        return this.things.size() + " things (" + this.totalWeight() + " kg)";
    }
}
