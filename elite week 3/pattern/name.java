package pattern;
import java.util.Scanner;
public class name {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        String pattern = "^[A-Za-z][A-Za-z ]{2,30}$";
        
        if (name.matches(pattern)) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
    }
}

