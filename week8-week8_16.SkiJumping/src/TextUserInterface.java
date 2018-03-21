/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
import java.util.Scanner;

public class TextUserInterface {
    private Scanner scanner;
    private Game game;
    
    public TextUserInterface(Scanner scanner, Game game){
        this.scanner = scanner;
        this.game = game;
    }
    
    public void play(){
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.print("  Participant name: ");
            String name = this.scanner.nextLine();
            if(!name.isEmpty())
                game.add(new Participant(name));
            else
                break;
        }
        
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();
        int i = 1;
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = this.scanner.nextLine();
            
            System.out.println();
            
            if (input.equals("jump")){
                System.out.println("Round " + i);
                System.out.println();
                game.printPoints();
                System.out.println();
                
                System.out.println("Results of round " + i);
                game.jump();
                System.out.println();
            }
            else
                break;
            
            i++;
        }
        
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        
        System.out.println("Tournament results:");
        game.printResults();
    }
}
