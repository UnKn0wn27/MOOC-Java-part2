/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(this.basket.get(product) == null){
            Purchase purchase = new Purchase(product, 1, price);
            this.basket.put(product, purchase);
        }
        else
            this.basket.get(product).increaseAmount();
    }
    
    public int price(){
        int total_price = 0;
        
        for(Purchase price : this.basket.values())
            total_price += price.price();
        
        return total_price;
    }
    
    public void print(){
        for(Purchase product : this.basket.values())
            System.out.println(product);
    }
}
