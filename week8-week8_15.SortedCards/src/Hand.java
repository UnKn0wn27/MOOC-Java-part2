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

public class Hand implements Comparable<Hand>{
    private List<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public void print(){
        for(Card card : this.cards)
            System.out.println(card);
    }
    
    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
    
    @Override
    public int compareTo(Hand hand){
        int sumValueThis = 0;
        int sumValueHand = 0;
        
        for(Card card : this.cards)
            sumValueThis += card.getValue();
        
        for(Card card : hand.cards)
            sumValueHand += card.getValue();
        
        return sumValueThis - sumValueHand;
    }
}
