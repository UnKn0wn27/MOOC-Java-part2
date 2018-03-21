import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write some test code here
        ShoppingBasket basket = new ShoppingBasket(); 
        basket.add("milk",3); 
        basket.add("sausage",7); 
        basket.add("milk",3); 
        basket.add("milk",3); 
        basket.add("sausage",7); 
        basket.add("cream", 2);
        
        System.out.println(basket.price());
    }
}
