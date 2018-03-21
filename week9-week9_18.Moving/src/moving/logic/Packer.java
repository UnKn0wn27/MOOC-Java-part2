/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author omuntean
 */
import java.util.List;
import java.util.ArrayList;

import moving.domain.Box;
import moving.domain.Thing;

public class Packer {
    private int boxesVolume;
    List<Box> boxes;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things){
        Box box = new Box(this.boxesVolume);
        boxes.add(box);
        for(Thing thing : things){
            if(box.addThing(thing)){}
            else{
                box = new Box(this.boxesVolume);
                box.addThing(thing);
                boxes.add(box);
            }
        }
                
        return boxes;
    }
}
