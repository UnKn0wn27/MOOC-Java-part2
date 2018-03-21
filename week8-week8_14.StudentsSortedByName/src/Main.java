import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {


    public static void main(String[] args){
        Student first = new Student("jamo");
        Student second = new Student("jamo");
        System.out.println(first.compareTo(second));
        
        List<Student> people = new ArrayList<Student>();
        people.add(new Student("Matti"));
        people.add(new Student("Pekka"));
        people.add(new Student("Mikko"));
        people.add(new Student("Arto"));
        people.add(new Student("Merja"));
        people.add(new Student("Pertti"));

        System.out.println(people);
        /*
         * When you have implemented the compareTo-method, remove comment below.
         */
        Collections.sort(people);
        System.out.println(people);
    }
}
