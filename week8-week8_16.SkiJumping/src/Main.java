import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.        
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        
        TextUserInterface ui = new TextUserInterface(scanner, game);
        
        ui.play();
    }
}
