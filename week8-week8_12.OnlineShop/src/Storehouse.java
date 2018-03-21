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
import java.util.Set;
import java.util.HashSet;

public class Storehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;
    
    public Storehouse(){
        this.products = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product,int price, int stock){
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String key){
        if (this.products.get(key) == null)
            return -99;
            
        return this.products.get(key);
    }
    
    public int stock(String product){
        if(this.stocks.get(product) == null)
            return 0;
        return this.stocks.get(product);
    }
    
    public boolean take(String product){
        if(this.stocks.get(product) == null || this.stocks.get(product) == 0)
            return false;
        
        this.stocks.put(product, this.stocks.get(product) - 1);
        return true;
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<String>();
        
        for(String product : this.products.keySet())
            products.add(product);
        
        return products;
    }
}
