/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author omuntean
 */

import java.util.List;
import java.util.ArrayList;

public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> things;
    
    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
    @Override
    public int getVolume(){
        int total_volume = 0;
        
        for(Thing thing : this.things){
            total_volume += thing.getVolume();
        }
        
        return total_volume;
    }
    
    public boolean addThing(Thing thing){
        int volume = this.getVolume();
        volume += thing.getVolume();
        if(volume <= this.maximumCapacity){
            this.things.add(thing);
            return true;
        }
        
        return false;
    }
}
