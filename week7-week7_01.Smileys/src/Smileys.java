
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        String newCharStr = ":) " + characterString + " :)";
        
        if (characterString.length() % 2 != 0){
            newCharStr = ":) " + characterString + "  :)";
        }
        for(int i = 0; i < newCharStr.length()/2; i++){
            System.out.print(":)");
        }
        
        System.out.println();
        System.out.print(newCharStr);
        System.out.println();
        
        for(int i = 0; i < newCharStr.length()/2; i++){
            System.out.print(":)");
        }
        
        System.out.println();
    }
}
