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

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> sensor_nrs;
    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.sensor_nrs = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    public List<Integer> readings(){
        return this.sensor_nrs;
    }
    
    @Override
    public boolean isOn(){
        int nr_of_true = 0;
        int nr_of_false = 0;
        for(Sensor sensor : sensors){
            if(sensor.isOn())
                nr_of_true++;
            else
                nr_of_false++;
        }
        return nr_of_true > nr_of_false;
    }
    
    @Override
    public void on(){
        for(Sensor sensor : this.sensors)
            sensor.on();
    }
    
    @Override
    public void off(){
        for(Sensor sensor : this.sensors)
            sensor.off();
    }
    
    @Override
    public int measure(){
        if(this.isOn()){
            int total_measure = 0;

            for(Sensor sensor : this.sensors)
                total_measure += sensor.measure();
            
            int avg = total_measure / this.sensors.size();
            this.sensor_nrs.add(avg);

            return avg;
        }
        else
            throw new IllegalStateException("Average sensor if off!");
    } 
}
