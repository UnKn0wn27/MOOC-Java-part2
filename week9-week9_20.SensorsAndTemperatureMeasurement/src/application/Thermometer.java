/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author omuntean
 */
import java.util.Random;

public class Thermometer implements Sensor{
    private boolean on_off;
    
    public Thermometer(){
        this.on_off = false;
    }
    
    @Override
    public boolean isOn(){
        return on_off;
    }
    
    @Override
    public void on(){
        if(!this.on_off)
            this.on_off = true;
    }
    
    @Override
    public void off(){
        if(this.on_off)
            this.on_off = false;
    }
    
    @Override
    public int measure(){
        Random random = new Random();
        if(isOn())
            return random.nextInt(30 + 1 + 30) - 30;
        else
            throw new IllegalStateException("Thermometer is off!");
    } 
}
