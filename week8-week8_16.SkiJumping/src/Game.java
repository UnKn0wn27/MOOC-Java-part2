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
import java.util.Collections;

public class Game{
    private List<Participant> participants;
    
    public Game(){
        this.participants = new ArrayList<Participant>();
    }
    
    public void add(Participant participant){
        participants.add(participant);
    }
    
    public void jump(){
        for(Participant participant : this.participants)
            participant.jump();
    }
    
    public void printPoints(){
        Collections.sort(participants);
        System.out.println("Jumping order:");
        for(int i = 0; i < this.participants.size(); i++){
            System.out.print("  " + (i + 1) + ". ");
            this.participants.get(i).printPoints();
        }
    }
    
    public void printResults(){
        Collections.sort(participants);
        Collections.reverse(participants);
        System.out.println("Position    Name");
        for(int i = 0; i < this.participants.size(); i++){
            System.out.print((i + 1) + "           ");
            this.participants.get(i).printPoints();
            System.out.print("            ");
            this.participants.get(i).printResults();
        }
    }
}
