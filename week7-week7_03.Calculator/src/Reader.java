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

public class Reader {
    private Scanner scanner;
    
    public Reader(){
        this.scanner = new Scanner(System.in);
    }
    
    public String readString(){
        String string= scanner.nextLine();
        return string;
    }
    
    public int readInteger(){
        int integer = Integer.parseInt(scanner.nextLine());
        return integer;
    }
    
    
}
