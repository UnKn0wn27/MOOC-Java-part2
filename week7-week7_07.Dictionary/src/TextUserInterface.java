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
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Statements:");
        System.out.println("\t quit - quit the text user interface");
        System.out.println("\t translate - asks a word and prints its translation");
        System.out.println("\t quit - quits the text user interface");
        System.out.println();
        
        while(true){
            System.out.print("Statement: ");
            String statement = this.reader.nextLine();
            if(statement.equals("quit")){
                System.out.println("Cheers!");
                break;
            }
            else if(statement.equals("add")){
                System.out.print("In Finnish: ");
                String finnish = this.reader.nextLine();
                System.out.print("Translation: ");
                String english = this.reader.nextLine();
                
                this.dictionary.add(finnish, english);
            }
            else if(statement.equals("translate")){
                System.out.print("Give a ward: ");
                String finnish = this.reader.nextLine();
                System.out.println("Translation: " + this.dictionary.translate(finnish));
            }
            else{
                System.out.println("Unknown  statement");
            }
            
        }
    }
}
