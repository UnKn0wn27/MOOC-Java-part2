public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService civil = new CivilService();
        
        System.out.println(civil.getDaysLeft());
        civil.work();
        System.out.println(civil.getDaysLeft());
    }
}
