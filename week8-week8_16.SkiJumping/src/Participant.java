/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

public class Participant implements Comparable<Participant>{
    private String name;
    private int points;
    private List<String> jump_lengths;
    
    public Participant(String name){
        this.name = name;
        this.points = 0;
        this.jump_lengths = new ArrayList<String>();
    }
    
    public void jump(){
        System.out.println("  " + this.name);
        Random random = new Random();
        
        int length = random.nextInt(60) + 60;
        jump_lengths.add(Integer.toString(length) + " m");
        this.points += length;
        System.out.println("    length: " + length);
        
        int[] judges = new int[5];
        
        for(int i = 0; i < judges.length; i++){
            judges[i] = random.nextInt(10) + 10;
        }
        
        Arrays.sort(judges);
        System.out.println("    judge votes: " +Arrays.toString(judges));
        
        for(int i = 1; i < judges.length - 1; i++)
            this.points += judges[i];
    }
    
    public int getPoints(){
        return this.points;
    }
    
    @Override
    public int compareTo(Participant participant){
        return this.points - participant.getPoints();
    }
    
    public void printPoints(){
        System.out.println(this.name + " (" + this.points + " points)");
    }
    
    public void printResults(){
        System.out.print("jump lengths: ");
        for(int i = 0; i < jump_lengths.size(); i++){
            System.out.print(jump_lengths.get(i));
            if(i + 1 != jump_lengths.size())
                System.out.print(", ");
        }
        System.out.println();
    }
}
