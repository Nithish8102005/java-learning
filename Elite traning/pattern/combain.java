package pattern;
import java.util.Scanner;

public class combain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        String namePattern = "^[A-Za-z][A-Za-z ]{2,30}$";
        String mobilePattern = "^[6-9]\\d{9}$";
        String emailPattern = "^[\\w.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        System.out.println("\n Validation Result");

        if (name.matches(namePattern)) {
            System.out.println("Name Valid");
        } else {
            System.out.println("Name Invalid");
        }

        if (mobile.matches(mobilePattern)) {
            System.out.println("Mobile Valid");
        } else {
            System.out.println("Mobile Invalid");
        }

        if (email.matches(emailPattern)) {
            System.out.println("Email Valid");
        } else {
            System.out.println("Email Invalid");
        }
    }


    
}
