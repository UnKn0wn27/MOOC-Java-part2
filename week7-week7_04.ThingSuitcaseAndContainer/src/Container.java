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

public class Container {
    private ArrayList<Suitcase> suitcases= new ArrayList<Suitcase>();
    private int weightLimit;
    
    public Container(int weight){
        this.weightLimit = weight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int totalWeight = this.totalWeight();
        totalWeight += suitcase.totalWeight();
        if (totalWeight <= this.weightLimit){
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int totalweight = 0;
        for(Suitcase suitcase : this.suitcases){
            totalweight += suitcase.totalWeight();
        }
        return totalweight;
    }
    
    public void printThings(){
        for(Suitcase suitcase : this.suitcases){
            suitcase.printThings();
        }
    }
    
    @Override
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
