import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        String input = "1\n" + "AY-123\n"  +
                    "108\n" + "1\n" +
                    "DE-213\n"  + "75\n" + "1\n" +
                    "RU-999\n" + "430\n" +
                    "2\n" + "AY-123\n" + "HEL\n" + "TXL\n" +
                    "2\n" + "AY-123\n" + "JFK\n" + "HEL\n" + "2\n" +
                    "DE-213\n" + "TXL\n" + "BAL\n" + "x\n" + "2\n" +
                    "1\n" + "3\n" + "AY-123\n" + "x\n";
        
        Scanner scanner = new Scanner(System.in);
        Airplane airplane = new Airplane();
        Flight flight = new Flight();
        
        TextUserReader ui = new TextUserReader(scanner, airplane, flight);

        ui.play();
    }
    
}
