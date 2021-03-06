/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
import java.io.File;
import java.util.Scanner;

public class Printer {
    private String fileName;
    
    public Printer(String fileName) throws Exception{
        this.fileName = fileName;
    }
    
    public void printLinesWhichContain(String word){
        File file = new File(fileName);
        
        Scanner reader = new Scanner(file);
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            if(line.contains(word))
                System.out.println(line);
            if(line.isEmpty())
                System.out.println(line);
        }
        
        reader.close();
    }
}
