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

public class TextUserReader {
    private Scanner scanner;
    private Airplane airplane;
    private Flight flight;
    
    public TextUserReader(Scanner reader, Airplane airplane, Flight flight){
        this.scanner = reader;
        this.airplane = airplane;
        this.flight = flight;
    }
    
    public void play(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            
            System.out.print("> ");
            String input = scanner.nextLine();
            
            if (input.equals("1")){
                System.out.print("Give plane ID: ");
                String id = scanner.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(scanner.nextLine());
                
                airplane.add(id, capacity);
            }
            else if (input.equals("2")){
                System.out.print("Give plane ID: ");
                String id = scanner.nextLine();
                System.out.print("Give departure airport code: ");
                String departure = scanner.nextLine();
                System.out.print("Give destination airport code: ");
                String destination = scanner.nextLine();
                
                id = airplane.printPlane(id);
                
                flight.add(id, departure + "-" + destination);
            }
            else if ((input.equals("x"))){
                break;
            }
        }
        
        System.out.println("Flight service");
        System.out.println("------------");
        
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            
            System.out.print("> ");
            String input = scanner.nextLine();
            
            if (input.equals("1")){
                airplane.printPlanes();
                System.out.println();
            }
            else if (input.equals("2")){
                flight.printFlights();
                System.out.println();
            }
            else if (input.equals("3")){
                System.out.print("Give plane ID: ");
                String id = scanner.nextLine();
                
                System.out.println(airplane.printPlane(id));
                System.out.println();
            }
            else if ((input.equals("x"))){
                break;
            }
        }
    }
}
