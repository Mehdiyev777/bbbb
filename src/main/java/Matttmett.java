import java.util.Scanner;
public class Matttmett {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("enter");
       
       String s1 = input.nextLine();
       String s2 = input.nextLine();
       
        if (s1.compareTo(s2) > 0) {
            System.out.println(s1 + s2); }
        else if (s1.compareTo(s2) == 0) {
            System.out.println(s1 + " esittir " + s2); }
        else  {
            System.out.println(s2  +" "+s1);
            
        }
        
       s1 = String.Copy(s2);
       
    }
}
