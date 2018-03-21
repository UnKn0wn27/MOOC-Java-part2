
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        Thing thing = new Thing("Brick", 500);
        Suitcase suitcase = new Suitcase(500);
        suitcase.addThing(thing);
        container.addSuitcase(suitcase);
        
        thing = new Thing("Brick", 500);
        suitcase = new Suitcase(500);
        suitcase.addThing(thing);
        container.addSuitcase(suitcase);
//        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
    public static void addSuitcasesFullOfBricks(Container container){
        for(int i = 1; i <= 100; i++){
            Thing thing = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(i);
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
        }
    }

}
