package pattern;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        
        String pattern = "^[\\w.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        
        if (email.matches(pattern)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
