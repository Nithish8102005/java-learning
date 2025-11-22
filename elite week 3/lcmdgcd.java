import java.util.*;
public class lcmdgcd {
    public static int gcd(int a,int b){
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number1: ");
        int a = Sc.nextInt();
        System.out.print("Enter the Number2: ");
        int b = Sc.nextInt();
        System.out.println("The GCD numbers are: " + gcd(a,b));
        System.out.println("The LCM numbers are: " + lcm(a,b));

    }
}