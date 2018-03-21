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

public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> objects;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.objects = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored object){
        double currentWeight = weight() + object.weight();
        if(currentWeight < this.maxWeight)
            this.objects.add(object);
    }
    
    @Override
    public double weight(){
        double totalWeight = 0;
        
        for(ToBeStored obj : this.objects){
            totalWeight += obj.weight();
        }
        
        return totalWeight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.objects.size() + " things, total weight " + this.weight() + " kg";
    }
}
