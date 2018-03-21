import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write some test code here
        Hand hand = new Hand();
        
        hand.add( new Card(3, Card.CLUBS) );
        hand.add( new Card(2, Card.CLUBS) );
        hand.add( new Card(14, Card.CLUBS) );
        hand.add( new Card(12, Card.CLUBS) );
        hand.add( new Card(2, Card.CLUBS) );
        
        hand.add( new Card(3, Card.DIAMONDS) );
        hand.add( new Card(2, Card.DIAMONDS) );
        hand.add( new Card(14, Card.DIAMONDS) );
        hand.add( new Card(12, Card.DIAMONDS) );
        hand.add( new Card(2, Card.DIAMONDS) );
        
        hand.add( new Card(3, Card.HEARTS) );
        hand.add( new Card(2, Card.HEARTS) );
        hand.add( new Card(14, Card.HEARTS) );
        hand.add( new Card(12, Card.HEARTS) );
        hand.add( new Card(2, Card.HEARTS) );

        hand.sortAgainstSuit();

        hand.print();
    }
}
