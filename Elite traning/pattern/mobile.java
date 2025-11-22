package pattern;
//pattern for mobile number validation
import java.util.Scanner;

public class mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mobile = sc.nextLine();
        
        String pattern = "^[6-9]\\d{9}$"; 
       { 
        if (mobile.matches(pattern))
             {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }
    }
}
}