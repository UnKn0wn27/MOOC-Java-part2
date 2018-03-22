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
    private File file;
    private Scanner reader;
    
    public Printer(String fileName) throws Exception{
        this.file = new File(fileName);
        this.reader = new Scanner(this.file);
    }
    
    public void printLinesWhichContain(String word){
        File file = new File("textfile.txt");
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
