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
public class ConstantSensor implements Sensor{
    private int measure_nr;
    
    public ConstantSensor(int measure_nr){
        this.measure_nr = measure_nr;
    }
    
    @Override
    public boolean isOn(){
        return true;
    }
    
    @Override
    public void on(){}
    
    @Override
    public void off(){}
    
    @Override
    public int measure(){
        return this.measure_nr;
    } 
}
