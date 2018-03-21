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
public class Item implements Thing, Comparable<Item>{
    private String name;
    private int parameter;
    
    public Item(String name, int parameter){
        this.name = name;
        this.parameter = parameter;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public int getVolume(){
        return this.parameter;
    }
    
    @Override
    public int compareTo(Item item){
        return this.parameter - item.getVolume();
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.parameter + " dm^3)";
    }
}
